import com.ofweek.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTestClass {
    @Test
    public void demo01() {
        System.out.println("demo01");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService)context.getBean("bookService");
        bookService.addBook();
        bookService.updatePrice(19.9f);
        bookService.deleteBook();


    }
}
