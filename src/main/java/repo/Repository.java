package repo;

import beans.Book;
import exception.IncorrectDataException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public interface Repository<T> {
    void addBook(List<String> params) throws IncorrectDataException;
    void updateBook(Book book,List<String> params) throws IncorrectDataException;

    void sort (Comparator<T> comparator);
    List<T> find (Specification<T> specification);
}
