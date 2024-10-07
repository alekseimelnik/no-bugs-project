package ht1.book;

public class BookClass implements Displayable {
    public String bookName;
    public String bookAuthor;
    public int bookYear;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    @Override
    public void display() {
        System.out.println("Book name: " + getBookName() +
                ", author: " + getBookAuthor() +
                ", year: " + getBookYear());
    }
}
