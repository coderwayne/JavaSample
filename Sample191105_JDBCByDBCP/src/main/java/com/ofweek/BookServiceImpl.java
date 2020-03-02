package com.ofweek;

public class BookServiceImpl implements BookService {
    public void getBookList() {
        BookDao bookDao = new BookDaoImpl();
        bookDao.getBookList();
    }

    public void addBook(Book book) {
        BookDao bookDao = new BookDaoImpl();
        bookDao.addBook(book);
    }

//    Book book = new Book();
//        book.setBookName("蛙");
//        book.setBookDes("诺贝尔文学奖作品");

}
