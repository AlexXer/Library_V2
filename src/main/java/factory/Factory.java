package factory;

import beans.Book;
import exception.IncorrectDataException;

import java.util.List;

public  interface Factory  {

     final static IncorrectDataException INCORRECT_DATA_EXCEPTION = new IncorrectDataException("Please, enter correct data");

     Book getObject(List<String> params) throws IncorrectDataException;

     void createParams(List<String> params) throws IncorrectDataException;
}
