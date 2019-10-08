package repo;

import beans.Book;
import exception.IncorrectDataException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * The interface Repository.

 * @param <T> the type parameter
 */
public interface Repository<T> {
    /**
     * Add book.
     *
     * @param params the params
     * @throws IncorrectDataException the incorrect data exception
     */


    void add(List<String> params, List<T> list) throws IncorrectDataException;

    /**
     * Update book.
     *
     * @param book   the book
     * @param params the params
     * @throws IncorrectDataException the incorrect data exception
     */
    void update(T object,List<T> list,List<String> params) throws IncorrectDataException;

    /**
     * Sort.
     *
     * @param comparator the comparator
     */
    void sort (List<T> list, Comparator<T> comparator);

    /**
     * Find list.
     *
     * @param specification the specification
     * @return the list
     */
    List<T> find (List<T> list,Specification<T> specification);
}
