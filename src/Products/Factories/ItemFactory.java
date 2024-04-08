package Products.Factories;

import Products.Book;
import Products.Item;
import Products.Magazine;
import Products.Newspaper;

public class ItemFactory {
    private static int lastBookId = 0;
    private static int lastMagazineId = 0;
    private static int lastNewspaperId = 0;

    public static Item createItem(Type type, String title, String genre, double price, int quantity, String author, int isbn) {
        switch (type) {
            case Book:
                return createBook(title, author, isbn, genre, price, quantity);
            case Magazine:
                return createMagazine(title, genre, price, quantity);
            case Newspaper:
                return createNewspaper(title, genre, price, quantity);
            default:
                throw new IllegalArgumentException("Invalid item type");
        }
    }

    private static Book createBook(String title, String author, int isbn, String genre, double price, int quantity) {
        int id = ++lastBookId;
        return new Book(id, title, author, isbn, genre, price, quantity);
    }

    private static Magazine createMagazine(String title, String genre, double price, int quantity) {
        int id = ++lastMagazineId;
        return new Magazine(id, title, genre, price, quantity);
    }

    private static Newspaper createNewspaper(String title, String genre, double price, int quantity) {
        int id = ++lastNewspaperId;
        return new Newspaper(id, title, genre, price, quantity);
    }
}
