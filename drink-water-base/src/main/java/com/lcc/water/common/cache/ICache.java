package com.lcc.water.common.cache;

/**
 * 分布式缓存服务接口(Distributed)
 *
 * @author lei
 */
public interface ICache {

    /**
     * 测试缓存中是否包含指定的Key
     */
    boolean containsKey(String scope, String key);

    /**
     * 从缓存中获取指定Key对应的原始值
     */
    String get(String scope, String key);

    /**
     * 从缓存中获取指定Key对应的对象
     */
    <T> T getObject(String scope, String key, Class<T> objClass);

    /**
     * 从缓存中获取指定Key对应的对象
     */
    <T> T getObject(String scope, String key, Class<T> objClass, Class<?> actualTypeClass);

    /**
     * 向缓存中设置一个Key用作标记
     */
    void put(String scope, String key);

    /**
     * 向缓存中设置一个Key用作标记
     *
     * @param expired 过期时间(S)
     */
    void put(String scope, String key, int expired);

    /**
     * 向缓存中设置值
     */
    void put(String scope, String key, Object value);

    /**
     * 向缓存中设置值
     *
     * @param expired 过期时间(S)
     */
    void put(String scope, String key, Object value, int expired);

    /**
     * 删除指定的缓存
     */
    void remove(String scope, String key);

    /**
     * 更新缓存中某个Key的过期时间
     *
     * @param expired 新的过期时间(S)
     */
    void setExpire(String scope, String key, int expired);
}
