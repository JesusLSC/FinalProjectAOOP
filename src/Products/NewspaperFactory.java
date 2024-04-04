package Products;

public class NewspaperFactory {
    public static Newspaper createNewspaper(String title, String genre, double price, int quantity) {
        return new Newspaper(title, genre, price, quantity);
    }
}
