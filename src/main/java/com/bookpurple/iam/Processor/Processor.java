package com.bookpurple.iam.Processor;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/*
 *  Created by Gaurav Sharma on 19th march 2019.
 *
 *  A new type of component
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Processor {
    @AliasFor(
            annotation = Component.class
    )
    String value() default "";
}
