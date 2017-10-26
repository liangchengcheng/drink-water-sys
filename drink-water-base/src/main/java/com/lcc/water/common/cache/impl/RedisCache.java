package com.lcc.water.common.cache.impl;

import com.lcc.water.common.cache.ICache;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisCache implements ICache {

    private static JedisPool jedisPool;

    private int maxTotal = 500;
    private int maxIdle = 5;
    private long maxWaitMillis = 1000 * 100;

    /**
     * Redis 主机地址
     */
    private String redisHost;

    /**
     * Redis 端口号
     */
    private int redisPort;

    /**
     * Key namespace
     */
    private String namespace;

    private String password;

    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public void setMaxWaitMillis(long maxWaitMillis) {
        this.maxWaitMillis = maxWaitMillis;
    }

    public void setRedisHost(String redisHost) {
        this.redisHost = redisHost;
    }

    public void setRedisPort(int redisPort) {
        this.redisPort = redisPort;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public RedisCache() {
    }

    public void connect() {
        if (jedisPool == null) {
            JedisPoolConfig config = new JedisPoolConfig();

            config.setMaxTotal(maxTotal);
            config.setMaxIdle(maxIdle);
            config.setMaxWaitMillis(maxWaitMillis);
            config.setTestOnBorrow(true);
            jedisPool = new JedisPool(config, redisHost, redisPort, 0, password);
        }
    }

    public void disconnect() {
        jedisPool.destroy();
    }

    @Override
    public boolean containsKey(String scope, String key) {

        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();

            return jedis.exists(obtainKey(scope, key));
        } finally {
            jedis.close();
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see com.uptech.homer.cache.ICache#get(java.lang.String)
     */
    @Override
    public String get(String scope, String key) {

        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();

            return jedis.get(obtainKey(scope, key));
        } finally {
            jedis.close();
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see com.uptech.homer.cache.ICache#getObject(java.lang.String,
     * java.lang.Class)
     */
    @Override
    public <T> T getObject(String scope, String key, Class<T> objClass) {

        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();

            if (key != null && objClass != null && jedis.exists(obtainKey(scope, key))) {
                String jsonVal = jedis.get(obtainKey(scope, key));
                return JsonHelper.getInstance().getObject(jsonVal, objClass);
            }

            return null;
        } finally {
            jedis.close();
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see com.uptech.homer.cache.ICache#getObject(java.lang.String,
     * java.lang.Class)
     */
    @Override
    public <T> T getObject(String scope, String key, Class<T> objClass, Class<?> actualTypeClass) {

        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();

            if (key != null && objClass != null && jedis.exists(obtainKey(scope, key))) {
                String jsonVal = jedis.get(obtainKey(scope, key));
                return JsonHelper.getInstance().getObject(jsonVal, objClass, actualTypeClass);
            }
            return null;
        } finally {
            if (null != jedis) {
                jedis.close();
            }

        }
    }

    /*
     * (non-Javadoc)
     *
     * @see com.uptech.homer.cache.ICache#put(java.lang.String,
     * java.lang.String)
     */
    @Override
    public void put(String scope, String key) {
        put(scope, key, null, -1);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.uptech.homer.cache.ICache#put(java.lang.String,
     * java.lang.String)
     */
    @Override
    public void put(String scope, String key, int expired) {
        put(scope, key, null, expired);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.uptech.homer.cache.ICache#put(java.lang.String,
     * java.lang.String)
     */
    @Override
    public void put(String scope, String key, Object value) {
        put(scope, key, value, -1);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.uptech.homer.cache.ICache#put(java.lang.String,
     * java.lang.String)
     */
    @Override
    public void put(String scope, String key, Object value, int expired) {

        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            if (key != null) {
                String jsonVal = JsonHelper.getInstance().getJsonString(value == null ? "" : value);

                if (expired > 0) {
                    jedis.setex(obtainKey(scope, key), expired, jsonVal);
                } else {
                    jedis.set(obtainKey(scope, key), jsonVal);
                }
            }
        } finally {
            jedis.close();
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see com.uptech.homer.cache.ICache#remove(java.lang.String)
     */
    @Override
    public void remove(String scope, String key) {

        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.del(obtainKey(scope, key));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see com.uptech.common.cache.ICache#setExpired(java.lang.String,
     * java.lang.String, int)
     */
    @Override
    public void setExpire(String scope, String key, int expired) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.expire(obtainKey(scope, key), expired);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
    }

    /**
     * 构造缓存Key
     */
    private String obtainKey(String scope, String key) {
        return namespace + "." + scope + "." + key;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
