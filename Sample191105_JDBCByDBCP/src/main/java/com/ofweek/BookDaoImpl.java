package com.ofweek;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class BookDaoImpl implements BookDao {
    private JdbcTemplate jdbcTemplate;

    private void connectToDB() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.2.123/live_mobile");
        dataSource.setUsername("exhibition");
        dataSource.setPassword("ofweek_2015");

        this.jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
    }

    @Test
    public void getBookList() {
        this.connectToDB();

        List bookList = jdbcTemplate.queryForList("select * from Book");

        for(int i=0; i<bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }
    }

    @Test
    public void addBook(Book book) {
        this.connectToDB();

        int result = jdbcTemplate.update("insert into Book values(?,?,?)",book.getBookId(),book.getBookName(),book.getBookDes());

        System.out.println(result);
    }

}
