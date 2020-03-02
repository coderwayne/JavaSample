import com.ofweek.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyClass {
    @Test
    public void testSomething() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService)context.getBean("userServiceImplId");

        userService.addUser();
    }

    @Test
    public void testStatic() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = context.getBean("userServiceId", UserService.class);

//        userService.addUser();

        //配置文件一加载，就会实例化，在bean.xml如果一个类有两个bean，那么构造函数会执行两次
    }

    public void testProxy() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        UserService userService = context.getBean("userServiceId", UserService.class);
//
//        Object obj = Proxy.newProxyInstance(UserService.class.getClassLoader(),
//                userService.getClass().getInterfaces(),
//                new InvocationHandler() {
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        return null;
//                    }
//                }
    }

}

