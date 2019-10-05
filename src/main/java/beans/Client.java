package beans;

import java.util.ArrayList;

public class Client extends Human {
    private ArrayList<Book> books;

    public Client(String firstName, String lastName, ArrayList<Book> books) {
        super(firstName, lastName);
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
