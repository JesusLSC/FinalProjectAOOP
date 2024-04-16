package Orders;

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

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public void addMagazine(Magazine magazine) {
        magazines.put(magazine.getTitle(), magazine);
    }

    public void addNewspaper(Newspaper newspaper) {
        newspapers.put(newspaper.getTitle(), newspaper);
    }

    public void removeBook(Book book) {
        books.remove(book.getTitle());
    }

    public void removeMagazine(Magazine magazine) {
        magazines.remove(magazine.getTitle());
    }

    public void removeNewspaper(Newspaper newspaper) {
        newspapers.remove(newspaper.getTitle());
    }

    public void updateBook(Book book) {
        if (books.containsKey(book.getTitle())) {
            books.put(book.getTitle(), book);
        }
    }

    public void updateMagazine(Magazine magazine) {
        if (magazines.containsKey(magazine.getTitle())) {
            magazines.put(magazine.getTitle(), magazine);
        }
    }

    public void updateNewspaper(Newspaper newspaper) {
        if (newspapers.containsKey(newspaper.getTitle())) {
            newspapers.put(newspaper.getTitle(), newspaper);
        }
    }

    public Book retrieveBook(String title) {
        return books.get(title);
    }

    public Magazine retrieveMagazine(String title) {
        return magazines.get(title);
    }

    public Newspaper retrieveNewspaper(String title) {
        return newspapers.get(title);
    }
}
