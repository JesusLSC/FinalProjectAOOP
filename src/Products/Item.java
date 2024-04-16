package Products;

public abstract class Item {
    private int id;
    private String title;
    private String genre;
    private double price;
    private int quantity;

    public Item(int id, String title, String genre, double price, int quantity) {
        setId(id);
        setTitle(title);
        setGenre(genre);
        setPrice(price);
        setQuantity(quantity);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}