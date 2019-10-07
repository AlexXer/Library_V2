package beans;

import beans.enm.BranchOfScience;
import beans.enm.TypeOfBook;

/**
 * The type Science book.
 */
public class ScienceBook extends Book {
    private BranchOfScience branchOfScience;

    /**
     * Instantiates a new Science book.
     *
     * @param author          the author
     * @param name            the name
     * @param countOfPages    the count of pages
     * @param typeOfBook      the type of book
     * @param branchOfScience the branch of science
     */
    public ScienceBook(String author, String name, int countOfPages, TypeOfBook typeOfBook, BranchOfScience branchOfScience) {
        super(author, name, countOfPages, typeOfBook);
        this.branchOfScience = branchOfScience;
    }

    /**
     * Gets branch of science.
     *
     * @return the branch of science
     */
    public BranchOfScience getBranchOfScience() {
        return branchOfScience;
    }

    /**
     * Sets branch of science.
     *
     * @param branchOfScience the branch of science
     */
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
