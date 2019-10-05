package factory;

import beans.Book;
import beans.ClassicBook;
import beans.enm.TypeOfBook;
import exception.IncorrectDataException;
import validator.BookValidator;

import java.util.List;

public class ClassicBookFactory implements Factory {
    private String author;

    private String name;

    private int countOfPages;

    private TypeOfBook typeOfBook;

    private int centuryOfWriting;


    @Override
    public Book getObject(List<String> params) throws IncorrectDataException {
        createParams(params);
        if(BookValidator.isCorrectNumber(countOfPages) && BookValidator.isCorrectNumber(centuryOfWriting)){
            return new ClassicBook(author,name,countOfPages,typeOfBook,centuryOfWriting);
        }
        throw  INCORRECT_DATA_EXCEPTION;
    }

    public  void createParams(List<String> params) throws IncorrectDataException {
         author = params.get(0);
         name = params.get(1);

        try {
            countOfPages =Integer.parseInt(params.get(2));
            typeOfBook = TypeOfBook.valueOf(params.get(3));
            centuryOfWriting=Integer.parseInt(params.get(4));
        }
        catch (Exception e){
            throw INCORRECT_DATA_EXCEPTION;
        }
    }
}
