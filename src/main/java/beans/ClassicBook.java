package beans;

import beans.enm.TypeOfBook;

import java.util.Objects;

/**
 * The type Classic book.
 */
public class ClassicBook extends Book {
    private int centuryOfWriting;

    /**
     * Instantiates a new Classic book.
     *
     * @param author           the author
     * @param name             the name
     * @param countOfPages     the count of pages
     * @param typeOfBook       the type of book
     * @param centuryOfWriting the century of writing
     */
    public ClassicBook(String author, String name, int countOfPages, TypeOfBook typeOfBook, int centuryOfWriting) {
        super(author, name, countOfPages, typeOfBook);
        this.centuryOfWriting = centuryOfWriting;
    }

    /**
     * Gets century of writing.
     *
     * @return the century of writing
     */
    public int getCenturyOfWriting() {
        return centuryOfWriting;
    }

    /**
     * Sets century of writing.
     *
     * @param centuryOfWriting the century of writing
     */
    public void setCenturyOfWriting(int centuryOfWriting) {
        this.centuryOfWriting = centuryOfWriting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassicBook)) return false;
        ClassicBook that = (ClassicBook) o;
        return (getCenturyOfWriting() == that.getCenturyOfWriting()) && getAuthor() == that.getAuthor() && getTitle() == that.getTitle() && getCountOfPages() == that.getCountOfPages() && getTypeOfBook() == that.getTypeOfBook();
    }

    @Override
    public String toString() {
        return getAuthor() + "  " + getTitle() + " " + getCountOfPages() + "  " + getTypeOfBook() + " " + getCenturyOfWriting();
    }
}
