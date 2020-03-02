package com.ofweek;

import java.util.List;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void addBook(Book book) {
        this.bookDao.addBook(book);
    }

    public List<Book> getAllBook() {
        return this.bookDao.getAllBook();
    }

    public Book getBookByID(int bookID) {
        return this.bookDao.getBookByID(bookID);
    }
}
