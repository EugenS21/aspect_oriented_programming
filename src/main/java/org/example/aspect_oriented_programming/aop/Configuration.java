package org.example.aspect_oriented_programming.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Configuration {

    @Before(value = "execution(* org.example.aspect_oriented_programming.model.Model.letMeDoIt(..)) and args(first, second)")
    public void beforeAdvice(JoinPoint joinPoint, String first, Integer second) {
        System.out.println("Before method:" + joinPoint.getSignature());
        System.out.println(String.format("Input parameters values %s %d", first, second));
    }

    @AfterThrowing(pointcut = "execution(* org.example.aspect_oriented_programming.model.Model.letMeDoItWithException(..))", throwing = "exception")
    public void errorInterceptor(IllegalAccessException exception) {
        System.out.println(" After exception " + exception.getCause());
    }

}
