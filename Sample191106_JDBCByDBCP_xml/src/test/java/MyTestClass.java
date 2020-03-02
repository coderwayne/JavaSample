import com.ofweek.Book;
import com.ofweek.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTestClass {
    @Test
    public void demo01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Book book = (Book)applicationContext.getBean("book");
        book.setBookID(998);
        book.setBookName("雾都孤儿");
        book.setBookDes("英国作家狄更斯于1838年出版的长篇写实小说");

        BookService bookService = (BookService)applicationContext.getBean("bookService");
        bookService.addBook(book);
    }

    @Test
    public void demo02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService)applicationContext.getBean("bookService");

        int result = bookService.updateBook(1998, "该作以雾都伦敦为背景，讲述了一个孤儿悲惨的身世及遭遇。");

        System.out.println(result);
    }

    @Test
    public void demo03() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService)applicationContext.getBean("bookService");

        Book book = (Book)applicationContext.getBean("book");
        book.setBookID(777);
        book.setBookName("悲惨世界");
        book.setBookDes("法国作家维克多·雨果在1862年发表的一部长篇小说");

        bookService.addBook(book);

        int result = bookService.updateBook(777, "该作多次被改编演绎成影视作品。");

        System.out.println(result);
    }
}
