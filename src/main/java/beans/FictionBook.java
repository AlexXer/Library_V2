package beans;

import beans.enm.TypeOfBook;
import beans.enm.TypeOfFiction;

public class FictionBook extends Book {
    private TypeOfFiction typeOfFiction;

    public FictionBook(String author, String name, int countOfPages, TypeOfBook typeOfBook, TypeOfFiction typeOfFiction) {
        super(author, name, countOfPages, typeOfBook);
        this.typeOfFiction = typeOfFiction;
    }

    public TypeOfFiction getTypeOfFiction() {
        return typeOfFiction;
    }

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
