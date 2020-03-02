package com.ofweek;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(* com.ofweek.UserServiceImpl.*(..))")
    private void myPointcut() {
    }

    @Before(value = "myPointcut()")
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("前置通知(before)");
    }

    @AfterReturning(value="myPointcut()", returning="returnObj")
    public void myAfterReturning(JoinPoint joinPoint, Object returnObj) {
        System.out.println("后置通知(after returning):" + returnObj);
    }

    @Around("myPointcut()")
    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("前方法");
        Object returnObj = joinPoint.proceed();
        System.out.println("后方法");
        return returnObj;
    }

    @AfterThrowing(value="myPointcut()", throwing="ex")
    public void myAfterThrowing(JoinPoint joinPoint, Throwable ex) {
        System.out.println("抛出异常：" + ex.getMessage());
    }

    @After("myPointcut()")
    public void myAfter(JoinPoint joinPoint) {
        System.out.println("最终通知(after)");
    }
}
