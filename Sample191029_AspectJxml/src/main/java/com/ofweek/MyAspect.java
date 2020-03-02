package com.ofweek;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("前置(before)");
    }

    public void myAfterReturning(JoinPoint joinPoint) {
        System.out.println("后置(after)");
    }

    public void myAfter(JoinPoint joinPoint) {
        System.out.println("最终通知(after)");
    }

    public void myAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕--前");
        Object result = joinPoint.proceed();
        System.out.println("环绕--后");
    }

    public void myAfterThrowing(JoinPoint joinPoint, Throwable ex) {
        System.out.println("抛出异常：" + ex.getMessage());
    }
}
