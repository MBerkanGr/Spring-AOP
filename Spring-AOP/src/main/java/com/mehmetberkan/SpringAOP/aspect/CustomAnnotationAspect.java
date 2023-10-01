package com.mehmetberkan.SpringAOP.aspect;

import com.mehmetberkan.SpringAOP.annotation.CustomAnnotation;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomAnnotationAspect {
    @Before("@annotation(customAnnotation)")
    public void printAnnotationInfoBeforeMethod(CustomAnnotation customAnnotation) {
        System.out.println(customAnnotation.value());
    }
}
