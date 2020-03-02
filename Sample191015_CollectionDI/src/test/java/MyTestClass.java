import com.ofweek.CollectionTest;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTestClass {
    @Test
    public void demo01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionTest collectionTest = (CollectionTest)context.getBean("collectionTest");
        System.out.println(collectionTest);
    }
}
