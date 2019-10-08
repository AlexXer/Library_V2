package beans;

import beans.enm.TypeOfHuman;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Client.
 */
public class Client extends Human {
    private List<Book> books;

    /**
     * Instantiates a new Client.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param books     the books
     */
    public Client(String firstName, String lastName, TypeOfHuman typeOfHuman, List<Book> books) {
        super(firstName, lastName, typeOfHuman);
        this.books = books;
    }

    /**
     * Gets books.
     *
     * @return the books
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * Sets books.
     *
     * @param books the books
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
