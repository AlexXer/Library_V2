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
}
