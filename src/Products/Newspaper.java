package Products;

public class Newspaper extends Item {
    public Newspaper(int id, String title, String genre, double price, int quantity) {
        this.setId(id);
        this.setTitle(title);
        this.setGenre(genre);
        this.setPrice(price);
        this.setQuantity(quantity);
    }
}
