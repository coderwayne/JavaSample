package com.ofweek;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("前置处理"+bean.getClass()+","+beanName+","+BookService.class);

        if(bean.getClass() == BookServiceImpl.class) {
            System.out.println("是一个BookService类型");
        }

        return bean;
    }

    public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
        System.out.println("后置处理"+bean+","+beanName);

        Object returnObj = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("proxy begin");
                Object result = method.invoke(bean, args);
                System.out.println("proxy end");
                return result;
            }
        });

        return returnObj;
    }


}
