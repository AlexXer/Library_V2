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

public class BookRepository implements Repository<Book> {

    private List <Book> books = new ArrayList<>();
    private BookFactory bookFactory = new BookFactory();

    @Override
    public void addBook(List<String> params) throws IncorrectDataException {
        books.add(bookFactory.getFactory(TypeOfBook.valueOf(params.get(3))).getObject(params));
    }

    @Override
    public void updateBook(Book book, List<String> params) throws IncorrectDataException {
        for (Book a: books) {
            if (a.equals(book)){
                a = bookFactory.getFactory(TypeOfBook.valueOf(params.get(3))).getObject(params);
            }
        }
    }

    @Override
    public void sort(Comparator<Book> comparator) {
        books.sort(comparator);
    }

    @Override
    public List<Book> find(Specification<Book> specification) {
        List<Book> result = new ArrayList<>();
        for (Book a: books) {
            if (specification.match(a)) result.add(a);
        }
        return result;
    }
}
