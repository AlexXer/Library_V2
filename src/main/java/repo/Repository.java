package repo;

import beans.Book;
import exception.IncorrectDataException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * The interface Repository.
 *
 * @param <T> the type parameter
 */
public interface Repository<T> {
    /**
     * Add book.
     *
     * @param params the params
     * @throws IncorrectDataException the incorrect data exception
     */
    void addBook(List<String> params) throws IncorrectDataException;

    /**
     * Update book.
     *
     * @param book   the book
     * @param params the params
     * @throws IncorrectDataException the incorrect data exception
     */
    void updateBook(Book book,List<String> params) throws IncorrectDataException;

    /**
     * Sort.
     *
     * @param comparator the comparator
     */
    void sort (Comparator<T> comparator);

    /**
     * Find list.
     *
     * @param specification the specification
     * @return the list
     */
    List<T> find (Specification<T> specification);
}
