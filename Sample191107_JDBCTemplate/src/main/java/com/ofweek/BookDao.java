package com.ofweek;

import java.util.List;

public interface BookDao {
    public void addBook(Book book);
    public List<Book> getAllBook();
    public Book getBookByID(int bookID);
}
