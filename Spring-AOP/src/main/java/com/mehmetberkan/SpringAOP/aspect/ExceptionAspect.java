package com.mehmetberkan.SpringAOP.aspect;

import ch.qos.logback.classic.Logger;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionAspect {

    private final Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

    @AfterThrowing(value = "execution(* com.mehmetberkan.SpringAOP.service.*.*(..))", throwing = "exception")
    public void handleException(Exception exception) {
        logger.error(exception.getMessage());
        System.out.println("Exception = " + exception.getMessage());
    }
}
