package com.lcc.water.common.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用来对RESTFul API接口进行描述
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface ApiMethod {

    /**
     * 方法调用之前的日志
     */
    boolean beforeLog() default true;

    /**
     * 方法调用之后的日志
     */
    boolean afterLog() default true;
}