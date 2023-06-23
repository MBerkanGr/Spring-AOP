package com.mehmetberkan.SpringAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.mehmetberkan.SpringAOP.service.MessageService.addMessage(..))")
    public void addLogBeforeAddMessage(JoinPoint joinPoint) {
        System.out.println("addMessage before " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.mehmetberkan.SpringAOP.service.MessageService.addMessage(..))")
    public void addLogAfterAddMessage(JoinPoint joinPoint) {
        System.out.println("addMessage after " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }
}
