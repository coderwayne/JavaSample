package com.ofweek;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements BookDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addBook(Book book) {
        this.jdbcTemplate.update("insert into Book values(?,?,?)", book.getBookID(), book.getBookName(), book.getBookDes());
    }

    public int updateBook(int bookID, String bookDes) {
        return this.jdbcTemplate.update("update Book set bookDes=? where bookId=?", bookDes, bookID);
    }
}
