package beans;

import beans.enm.TypeOfBook;

public abstract class Book {
    private String author;

    private String title;

    private int countOfPages;

    private TypeOfBook typeOfBook;

    public Book(String author, String title, int countOfPages, TypeOfBook typeOfBook) {
        this.author = author;
        this.title = title;
        this.countOfPages = countOfPages;
        this.typeOfBook = typeOfBook;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public TypeOfBook getTypeOfBook() {
        return typeOfBook;
    }

    public void setTypeOfBook(TypeOfBook typeOfBook) {
        this.typeOfBook = typeOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return getAuthor() + "  " + getTitle() + " " + getCountOfPages() +  "  " + getTypeOfBook();
    }
}
