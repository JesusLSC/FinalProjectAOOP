package Products.Factories;

import Products.Book;

public class BookFactory{
    public static Book createBook(String title, String author, String isbn, String genre, double price, int quantity) {
        return new Book(title, author, isbn, genre, price, quantity);
    }
}
