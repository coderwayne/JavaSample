package com.ofweek;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("前方法");
        Object result = methodInvocation.proceed();
        System.out.println("后方法");
        return result;
    }
}
