package com.ofweek;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Method;

public class MyBeanFactory {
    public static Huntress createHuntress() {
        final Huntress huntress = new Huntress();
        final MyAspect aspect = new MyAspect();

        Enhancer enhancer = new Enhancer();
        //父类
        enhancer.setSuperclass(huntress.getClass());
        //回调，MethodInterceptor接口等效于jdk里的InvocationHandler接口
        //intercept()相当于jdk的invoke()
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                aspect.MyBefore();
                Object result = method.invoke(huntress, objects);
                aspect.MyAfter();
                methodProxy.invokeSuper(o, objects); //将会执行代理类的父类，即目标类(目标类和代理类是父子关系)的方法
                return result;
            }
        });

        Huntress huntressProxy = (Huntress)enhancer.create();
        return huntressProxy;
    }
}
