package com.lcc.water.common.util;

import com.google.gson.*;
import com.lcc.water.common.json.DateTypeAdapter;
import com.lcc.water.common.json.TimestampTypeAdapter;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JsonHelper {
    protected static ThreadLocal<JsonHelper> singletonInstanceMap = new ThreadLocal();

    protected Gson gson;

    protected JsonHelper() {
        this(null);
    }

    protected JsonHelper(Map<Type, Object> typeAdapterMap) {
        GsonBuilder gsonBuilder = getGsonBuilder();
        if (typeAdapterMap != null && !typeAdapterMap.isEmpty()) {
            Set<Type> typeSet = typeAdapterMap.keySet();
            for (Type type : typeSet) {
                if (type != null) {
                    gsonBuilder.registerTypeAdapter(type, typeAdapterMap.get(type));
                }
            }
        }

        gson = gsonBuilder.create();
    }

    public static JsonHelper getInstance() {
        if (singletonInstanceMap.get() == null) {
            singletonInstanceMap.set(new JsonHelper(null));
        }

        return singletonInstanceMap.get();
    }

    public static JsonHelper getInstance(Map<Type, Object> typeAdapterMap) {
        return new JsonHelper(typeAdapterMap);
    }

    public static JsonHelper getInstance(Type type, Object typeAdapter) {

        Map<Type, Object> typeAdapterMap = new HashMap();
        typeAdapterMap.put(type, typeAdapter);

        return new JsonHelper(typeAdapterMap);
    }

    /**
     * 获取指定对象的JsonArray包装
     */
    public static JsonArray getJsonArray(byte[] src) {
        JsonArray jsonAry = null;
        if (src != null && src.length > 0) {
            jsonAry = new JsonArray();
            for (byte srcElement : src) {
                jsonAry.add(getJsonPrimitive(srcElement));
            }
        }

        return jsonAry;
    }

    /**
     * 获取对象的JsonPrimitive包装；目前仅支持byte、string两种类型
     */
    public static JsonPrimitive getJsonPrimitive(Object src) {
        JsonPrimitive jsonPrimitive = null;
        if (src != null && src instanceof Byte) {
            jsonPrimitive = new JsonPrimitive((Byte) src);
        } else if (src != null && src instanceof String) {
            jsonPrimitive = new JsonPrimitive(src.toString());
        }

        return jsonPrimitive;
    }

    /**
     * 将给定的对象转换为JSON字符串
     */
    public String getJsonString(Object src) {
        if (src == null) {
            return null;
        }

        return gson.toJson(src);
    }

    public <T> T getObject(String jsonString, Class<T> objTypeClass) {
        return getObject(jsonString, objTypeClass, null);
    }

    /**
     * 将JSON字符串解析为指定类型的对象
     */
    public <T> T getObject(String jsonString, Class<T> objTypeClass, Class<?> actualTypeClass) {
        if (jsonString == null) {
            return null;
        }

        ParameterizedType paramType = null;
        if (actualTypeClass != null) {
            paramType = type(objTypeClass, new Type[]{actualTypeClass});
        } else {
            paramType = type(objTypeClass, new Type[0]);
        }

        return objTypeClass.cast(gson.fromJson(jsonString, paramType));
    }

    /**
     * 构造GsonBuilder对象
     */
    protected GsonBuilder getGsonBuilder() {
        return new GsonBuilder().disableHtmlEscaping().registerTypeAdapter(Date.class, new DateTypeAdapter())
                .registerTypeAdapter(Timestamp.class, new TimestampTypeAdapter())
                .setLongSerializationPolicy(LongSerializationPolicy.DEFAULT).serializeNulls()
                .addSerializationExclusionStrategy(new ExclusionStrategy() {
                    @Override
                    public boolean shouldSkipField(FieldAttributes f) {
                        if (f.getName().startsWith("_")) {
                            return true;
                        } else {
                            return false;
                        }
                    }

                    @Override
                    public boolean shouldSkipClass(Class<?> clazz) {
                        return false;
                    }
                });
    }

    /**
     * 私有方法；构造类型描述对象
     */
    protected ParameterizedType type(final Class<?> raw, final Type[] args) {

        return new ParameterizedType() {

            public Type getRawType() {
                return raw;
            }

            public Type[] getActualTypeArguments() {
                return args;
            }

            public Type getOwnerType() {
                return null;
            }
        };
    }
}
