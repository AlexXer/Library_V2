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


}
