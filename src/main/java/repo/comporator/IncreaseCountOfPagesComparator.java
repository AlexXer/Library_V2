package repo.comporator;

import beans.Book;

import java.util.Comparator;

/**
 * The type Increase count of pages comparator.
 */
public class IncreaseCountOfPagesComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getCountOfPages()-o2.getCountOfPages();
    }
}
