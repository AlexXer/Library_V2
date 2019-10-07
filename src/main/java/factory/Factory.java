package factory;

import beans.Book;
import exception.IncorrectDataException;

import java.util.List;

/**
 * The interface Factory.
 */
public  interface Factory  {

     /**
      * The constant INCORRECT_DATA_EXCEPTION.
      */
     final static IncorrectDataException INCORRECT_DATA_EXCEPTION = new IncorrectDataException("Please, enter correct data");

     /**
      * Gets object.
      *
      * @param params the params
      * @return the object
      * @throws IncorrectDataException the incorrect data exception
      */
     Book getObject(List<String> params) throws IncorrectDataException;

     /**
      * Create params.
      *
      * @param params the params
      * @throws IncorrectDataException the incorrect data exception
      */
     void createParams(List<String> params) throws IncorrectDataException;
}
