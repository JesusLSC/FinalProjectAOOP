import Products.Book;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Book> books;

    public Inventory() {
        this.books = new HashMap<>();
    }

    public void addBook(){};
    public void removeBook(){};
    public void updateBook(){};
    public void retriveBook(){};

}

