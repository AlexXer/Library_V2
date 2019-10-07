package beans;

import java.util.ArrayList;

/**
 * The type Client.
 */
public class Client extends Human {
    private ArrayList<Book> books;

    /**
     * Instantiates a new Client.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param books     the books
     */
    public Client(String firstName, String lastName, ArrayList<Book> books) {
        super(firstName, lastName);
        this.books = books;
    }

    /**
     * Gets books.
     *
     * @return the books
     */
    public ArrayList<Book> getBooks() {
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
