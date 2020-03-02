import com.ofweek.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTestClass {
    @Test
    public void demo01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService)context.getBean("proxyAccountService");
        accountService.transfer("jack", "rose", 1000);
    }

    @Test
    public void demo02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService)context.getBean("proxyAccountService");
        accountService.payService(200);
    }
}
