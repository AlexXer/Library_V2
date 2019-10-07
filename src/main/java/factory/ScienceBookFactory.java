package factory;

import beans.Book;
import beans.ScienceBook;
import beans.enm.BranchOfScience;
import beans.enm.TypeOfBook;
import beans.enm.TypeOfFiction;
import exception.IncorrectDataException;
import validator.BookValidator;

import java.util.List;

/**
 * The type Science book factory.
 */
public class ScienceBookFactory implements Factory {

    private String author;

    private String name;

    private int countOfPages;

    private TypeOfBook typeOfBook;

    private BranchOfScience branchOfScience;

    @Override
    public Book getObject(List<String> params) throws IncorrectDataException{
        createParams(params);
        if(BookValidator.isCorrectNumber(countOfPages)){
            new ScienceBook(author,name,countOfPages,typeOfBook,branchOfScience);
        }
        throw INCORRECT_DATA_EXCEPTION;
    }

    @Override
    public void createParams(List<String> params) throws IncorrectDataException {
        author = params.get(0);
        name = params.get(1);

        try {
            countOfPages = Integer.parseInt(params.get(2));
            typeOfBook = TypeOfBook.valueOf(params.get(3));
            branchOfScience =BranchOfScience.valueOf(params.get(4));
        }
        catch (Exception ex){
            throw INCORRECT_DATA_EXCEPTION;
        }
    }
}
