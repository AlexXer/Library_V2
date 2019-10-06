package repo.comporator;

import beans.Book;

import java.util.Comparator;

public class DecreaseCountOfPagesComparator implements Comparator <Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getCountOfPages() == o2.getCountOfPages()? 0 : o1.getCountOfPages()<o2.getCountOfPages()? 1: -1;
    }
}
