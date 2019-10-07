package repo.comporator;

import beans.Book;

import java.util.Comparator;

/**
 * The type Decrease count of pages comparator.
 */
public class DecreaseCountOfPagesComparator implements Comparator <Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o2.getCountOfPages()-o1.getCountOfPages();
    }
}
