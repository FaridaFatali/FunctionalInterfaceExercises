package org.example.book;

public class Book implements Comparable{
    private String title;
    private String authorFirstName;
    private String authorLastName;
    private int pages;

    public Book() {
        this.title = "No title specified!";
        this.authorFirstName = "No author first name specified!";
        this.authorLastName = "No author last name specified!";
        this.pages = 0;
    }

    public Book(String title, String authorFirsName, String authorLastName, int pages) {
        this.title = title;
        this.authorFirstName = authorFirsName;
        this.authorLastName = authorLastName;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorFirsName() {
        return authorFirstName;
    }

    public void setAuthorFirsName(String authorFirsName) {
        this.authorFirstName = authorFirsName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        return getTitle() + " (" + pages + " pages) " + " Written By: " + getAuthorFirsName() + " " + getAuthorLastName() + "\n";
    }

    @Override
    public int compareTo(Object o) {
        Book book = (Book) o;
        return title.compareTo(book.getTitle());
    }

    public void printInfo() {
        System.out.println("**** BOOK INFO ****");
        System.out.println(this);
    }
}
