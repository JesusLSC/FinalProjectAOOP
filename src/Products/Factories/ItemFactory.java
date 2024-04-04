package Products.Factories;

import Products.Book;
import Products.Item;
import Products.Magazine;
import Products.Newspaper;

public class ItemFactory {
    public static Item createItem(Type type, String title, String genre, double price, int quantity, String author, String isbn) {
        switch (type) {
            case Book:
                return new Book(title, author, isbn, genre, price, quantity);
            case Magazine:
                return new Magazine(title, genre, price, quantity);
            case Newspaper:
                return new Newspaper(title, genre, price, quantity);
            default:
                throw new IllegalArgumentException("Invalid item type");
        }
    }
}
