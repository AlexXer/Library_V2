package repo.implementation;

import beans.Book;
import beans.enm.TypeOfBook;
import exception.IncorrectDataException;
import factory.BookFactory;
import repo.Repository;
import repo.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * The type Book repository.
 */
public class BookRepository implements Repository<Book> {

    private BookFactory bookFactory = new BookFactory();

    @Override
    public void add(List<String> params, List<Book> list) throws IncorrectDataException {
        list.add((Book) bookFactory.getFactory(TypeOfBook.valueOf(params.get(3))).getObject(params));
    }

    @Override
    public void update(Book book,List<Book> books, List<String> params) throws IncorrectDataException {
        for (Book a: books) {
            if (a.equals(book)){
                a = (Book) bookFactory.getFactory(TypeOfBook.valueOf(params.get(3))).getObject(params);
            }
        }
    }

    @Override
    public void sort(List <Book> books,Comparator<Book> comparator) {
        books.sort(comparator);
    }

    @Override
    public List<Book> find(List<Book> books,Specification<Book> specification) {
        List<Book> result = new ArrayList<>();
        for (Book a: books) {
            if (specification.match(a)) result.add(a);
        }
        return result;
    }
}
