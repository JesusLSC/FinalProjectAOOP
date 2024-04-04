package Products;

public class Newspaper extends Item {
    public Newspaper(String title, String genre, double price, int quantity) {
        this.setTitle(title);
        this.setGenre(genre);
        this.setPrice(price);
        this.setQuantity(quantity);
    }
}
