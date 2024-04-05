package Products;

public class Magazine extends Item {
    public Magazine(int id, String title, String genre, double price, int quantity) {
        this.setId(id);
        this.setTitle(title);
        this.setGenre(genre);
        this.setPrice(price);
        this.setQuantity(quantity);
    }
}
