package beans;

import beans.enm.TypeOfBook;

/**
 * The type Book.
 */
public abstract class Book {
    private String author;

    private String title;

    private int countOfPages;

    private TypeOfBook typeOfBook;

    /**
     * Instantiates a new Book.
     *
     * @param author       the author
     * @param title        the title
     * @param countOfPages the count of pages
     * @param typeOfBook   the type of book
     */
    public Book(String author, String title, int countOfPages, TypeOfBook typeOfBook) {
        this.author = author;
        this.title = title;
        this.countOfPages = countOfPages;
        this.typeOfBook = typeOfBook;
    }

    /**
     * Gets count of pages.
     *
     * @return the count of pages
     */
    public int getCountOfPages() {
        return countOfPages;
    }

    /**
     * Sets count of pages.
     *
     * @param countOfPages the count of pages
     */
    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    /**
     * Gets type of book.
     *
     * @return the type of book
     */
    public TypeOfBook getTypeOfBook() {
        return typeOfBook;
    }

    /**
     * Sets type of book.
     *
     * @param typeOfBook the type of book
     */
    public void setTypeOfBook(TypeOfBook typeOfBook) {
        this.typeOfBook = typeOfBook;
    }

    /**
     * Gets author.
     *
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets author.
     *
     * @param author the author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return getAuthor() + "  " + getTitle() + " " + getCountOfPages() +  "  " + getTypeOfBook();
    }
}
