package beans;

import beans.enm.BranchOfScience;
import beans.enm.TypeOfBook;

public class ScienceBook extends Book {
    private BranchOfScience branchOfScience;

    public ScienceBook(String author, String name, int countOfPages, TypeOfBook typeOfBook, BranchOfScience branchOfScience) {
        super(author, name, countOfPages, typeOfBook);
        this.branchOfScience = branchOfScience;
    }

    public BranchOfScience getBranchOfScience() {
        return branchOfScience;
    }

    public void setBranchOfScience(BranchOfScience branchOfScience) {
        this.branchOfScience = branchOfScience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ScienceBook)) return false;
        ScienceBook that = (ScienceBook) o;
        return (getBranchOfScience() == that.getBranchOfScience()) && getAuthor().equals(that.getAuthor()) && getTitle().equals(that.getTitle()) && getCountOfPages() == that.getCountOfPages() && getTypeOfBook() == that.getTypeOfBook();
    }

    @Override
    public String toString() {
        return getAuthor() + "  " + getTitle() + " " + getCountOfPages() +  "  " + getTypeOfBook() + " " +getBranchOfScience();
    }
}
