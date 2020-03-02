package com.ofweek;

public class BookServiceImpl implements BookService {
    public String bookName;
    public Float price;
    public Author author;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookServiceImpl{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                ", author=" + author +
                '}';
    }
}
