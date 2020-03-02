import com.ofweek.Book;
import com.ofweek.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTestClass {
    @Test
    public void demo01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService)context.getBean("bookService");
        Book book = (Book)context.getBean("book");
        bookService.addBook(book);
    }

    @Test
    public void demo02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService)context.getBean("bookService");

        List<Book> bookList = bookService.getAllBook();
        for(Book book : bookList) {
            System.out.println(book);
        }

        System.out.println("查询到一条结果：" + bookService.getBookByID(111));
    }
}
