package factory;

import beans.Book;
import beans.FictionBook;
import beans.enm.TypeOfBook;
import beans.enm.TypeOfFiction;
import exception.IncorrectDataException;
import validator.BookValidator;

import java.util.List;

public class FictionBookFactory implements Factory {

    private String author;

    private String name;

    private int countOfPages;

    private TypeOfBook typeOfBook;

    private TypeOfFiction typeOfFiction;


    @Override
    public Book getObject(List<String> params) throws IncorrectDataException {
        createParams(params);
        if(BookValidator.isCorrectNumber(countOfPages)){
            return new FictionBook(author,name,countOfPages,typeOfBook,typeOfFiction);
        }
        throw INCORRECT_DATA_EXCEPTION;
    }

    @Override
    public void createParams(List<String> params) throws IncorrectDataException {
        author = params.get(0);
        name = params.get(1);
        try{
            countOfPages = Integer.parseInt(params.get(2));
            typeOfBook = TypeOfBook.valueOf(params.get(3));
            typeOfFiction = TypeOfFiction.valueOf(params.get(4));
        }
        catch (Exception e){
            throw INCORRECT_DATA_EXCEPTION;
        }
    }
}
