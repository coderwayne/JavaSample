package com.ofweek;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class BookDaoImpl extends JdbcDaoSupport implements BookDao {
    public void addBook(Book book) {
        this.getJdbcTemplate().update("insert into Book values(?,?,?)",book.getBookID(), book.getBookName(), book.getBookDes());
    }

    public List<Book> getAllBook() {
        return this.getJdbcTemplate().query("select * from Book", BeanPropertyRowMapper.newInstance(Book.class));
    }

    public Book getBookByID(int bookID) {
        return this.getJdbcTemplate().queryForObject("select * from Book where bookId=?", BeanPropertyRowMapper.newInstance(Book.class), bookID);
    }
}
