import com.ofweek.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClass {

    @Test
    public void demo01() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService)context.getBean("bookServiceID");
        bookService.addBook();

        context.close();

//        context.getClass().getMethod("close").invoke(context);
    }
}
