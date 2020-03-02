package com.ofweek;

public interface BookDao {
    public void addBook(Book book);
    public int updateBook(int bookID,String bookDes);
}
