package com.ofweek;

public class BookServiceImpl implements BookService {
    public void addBook() {
        System.out.println("you added a book");
    }

    public String updatePrice(float money) {
        System.out.println("you updated a book");
//        int i = 1 / 0;
        return "success";
    }

    public void deleteBook() {
        System.out.println("you deleted a book");
    }
}
