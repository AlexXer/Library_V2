package beans;

import beans.enm.TypeOfBook;

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
}
