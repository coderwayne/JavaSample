package com.ofweek;

public class BookServiceImpl implements BookService {

    public void addBook() {
        System.out.println("you added a book");
    }

    public void initFun() {
        System.out.println("BookServiceImpl init action");
    }

    public void destroyFun() {
        System.out.println("BookServiceImpl destroy action");
    }
}
