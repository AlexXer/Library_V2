package beans;

import beans.enm.TypeOfBook;
import beans.enm.TypeOfFiction;

/**
 * The type Fiction book.
 */
public class FictionBook extends Book {
    private TypeOfFiction typeOfFiction;

    /**
     * Instantiates a new Fiction book.
     *
     * @param author        the author
     * @param name          the name
     * @param countOfPages  the count of pages
     * @param typeOfBook    the type of book
     * @param typeOfFiction the type of fiction
     */
    public FictionBook(String author, String name, int countOfPages, TypeOfBook typeOfBook, TypeOfFiction typeOfFiction) {
        super(author, name, countOfPages, typeOfBook);
        this.typeOfFiction = typeOfFiction;
    }

    /**
     * Gets type of fiction.
     *
     * @return the type of fiction
     */
    public TypeOfFiction getTypeOfFiction() {
        return typeOfFiction;
    }

    /**
     * Sets type of fiction.
     *
     * @param typeOfFiction the type of fiction
     */
    public void setTypeOfFiction(TypeOfFiction typeOfFiction) {
        this.typeOfFiction = typeOfFiction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FictionBook)) return false;
        FictionBook that = (FictionBook) o;
        return (getTypeOfFiction() == that.getTypeOfFiction()) && getAuthor().equals(that.getAuthor()) && getTitle().equals(that.getTitle()) && getCountOfPages() == that.getCountOfPages() && getTypeOfBook() == that.getTypeOfBook();
    }

    @Override
    public String toString() {
        return getAuthor() + "  " + getTitle() + " " + getCountOfPages() +  "  " + getTypeOfBook() + " " + getTypeOfFiction();
    }
}
