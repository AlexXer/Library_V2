package beans;

import beans.enm.TypeOfBook;

public abstract class Book {
    private String author;

    private String name;

    private int countOfPages;

    private TypeOfBook typeOfBook;

    public Book(String author, String name, int countOfPages, TypeOfBook typeOfBook) {
        this.author = author;
        this.name = name;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
