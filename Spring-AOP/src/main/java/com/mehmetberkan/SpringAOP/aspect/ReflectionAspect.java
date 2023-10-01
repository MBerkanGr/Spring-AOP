package com.mehmetberkan.SpringAOP.aspect;

import com.mehmetberkan.SpringAOP.model.Message;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

@Aspect
@Component
public class ReflectionAspect {
    @After("execution(* com.mehmetberkan.SpringAOP.service.MessageService.addMessage(..)) && args(message)")
    public void useReflectionAfterAddMessage(Message message) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        if (message.getContent().isEmpty()) {
            System.out.println("Content is empty");
        }

        Class<?> clazz = message.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        Field[] fields = clazz.getDeclaredFields();

        for (Method m : methods) {
            System.out.println("Method = " + m);
        }

        for (Field f : fields) {
            System.out.println("Field = " + f);
        }

        Object instance = clazz.newInstance();

        Method method = clazz.getDeclaredMethod("concatContentWithDate", String.class, Date.class);
        Object result = method.invoke(instance, "Content", new Date());

        System.out.println(result.toString());

    }
}
