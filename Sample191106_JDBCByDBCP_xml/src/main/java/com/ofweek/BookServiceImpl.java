package com.ofweek;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    public int updateBook(int bookID, String bookDes) {
        return bookDao.updateBook(bookID, bookDes);
    }
}
