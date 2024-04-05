import Products.Book;
import Products.Magazine;
import Products.Newspaper;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Book> books;
    private Map<String, Magazine> magazines;
    private Map<String, Newspaper> newspapers;

    public Inventory() {
        this.books = new HashMap<>();
        this.magazines = new HashMap<>();
        this.newspapers = new HashMap<>();
    }

    public void addBook(Book book){};
    public void addMagazine(Magazine magazine){};
    public void addNewspaper(Newspaper newspaper){};
    public void removeBook(Book book){};
    public void removeMagazine(Magazine magazine){};
    public void removeNewspaper(Newspaper newspaper){};
    public void updateBook(Book book){};
    public void updateMagazine(Magazine magazine){};
    public void updateNewspaper(Newspaper newspaper){};
    public void retriveBook(Book book){};
    public void retriveMagazine(Magazine magazine){};
    public void retriveNewspaper(Newspaper newspaper){};

}

