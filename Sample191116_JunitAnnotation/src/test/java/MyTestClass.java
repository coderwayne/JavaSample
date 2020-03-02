import com.ofweek.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MyTestClass {
    //此处的@Autowired是与Junit整合的，不需要在xml里配置扫描。
    @Autowired
    private BookService bookService;

    @Test
    public void demo01() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookService bookService = (BookService)context.getBean("bookService");
        bookService.addBook();
    }
}
