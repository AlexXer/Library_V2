package beans;

import beans.enm.TypeOfBook;

import java.util.Objects;

public class ClassicBook extends Book {
    private int centuryOfWriting;

    public ClassicBook(String author, String name, int countOfPages, TypeOfBook typeOfBook, int centuryOfWriting) {
        super(author, name, countOfPages, typeOfBook);
        this.centuryOfWriting = centuryOfWriting;
    }

    public int getCenturyOfWriting() {
        return centuryOfWriting;
    }

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
        return getAuthor() + "  " + getTitle() + " " + getCountOfPages() +  "  " + getTypeOfBook() + " " + getCenturyOfWriting();
    }
}
