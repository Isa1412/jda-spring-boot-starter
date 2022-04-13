package com.github.isa1412.jda.starter;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Indicates that an annotated class is a "EventListener" from JDA.
 * This annotation also serves as a specialization of @Component, allowing for implementation classes to be autodetected
 * through classpath scanning.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface JDAEventListener {

    @AliasFor(annotation = Component.class)
    String value() default "";
}
