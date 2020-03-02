import com.ofweek.Book;
import com.ofweek.BookService;
import com.ofweek.BookServiceImpl;
import org.junit.Test;

public class MyTestClass {
    @Test
    public void demo01() {
        BookService bookService = new BookServiceImpl();
        bookService.getBookList();


    }

    @Test
    public void demo02() {
        BookService bookService = new BookServiceImpl();

        Book book = new Book();
        book.setBookId(22);
        book.setBookName("三国演义");
        book.setBookDes("罗贯中的巨作");
        bookService.addBook(book);
    }
}
