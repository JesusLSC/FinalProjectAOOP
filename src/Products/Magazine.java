package Products;

public class Magazine extends Item {
    public Magazine(String title, String genre, double price, int quantity) {
        this.setTitle(title);
        this.setGenre(genre);
        this.setPrice(price);
        this.setQuantity(quantity);
    }
}
