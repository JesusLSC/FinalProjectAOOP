package Products;

public class MagazineFactory {
    public static Magazine createMagazine(String title, String genre, double price, int quantity) {
        return new Magazine(title, genre, price, quantity);
    }
}
