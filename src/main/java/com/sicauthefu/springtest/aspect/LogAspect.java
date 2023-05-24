package com.sicauthefu.springtest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

@Aspect
public class LogAspect {

    @Around("execution(* com.sicauthefu.springtest.service.*.*(..))")
    public Object businessService(ProceedingJoinPoint pjp) throws Throwable {
        // get attribute through annotation
        Method method = ((MethodSignature) pjp.getSignature()).getMethod();
        System.out.println("execute method: " + method.getName());

        // continue to process
        return pjp.proceed();
    }
}

/**
 * 有了spring框架，通过@Aspect注解定义了切面，这个切面中定义了拦截所有service中的方法，并记录日志了；可以明显看到，框架将日志记录和业务需求的代码解耦了，不再是侵入式的了
 *
 * Spring框架通过定义切面，通过拦截切点实现了不同业务模块的解耦，这个就是面向切面编程（AOP）
 */
