package Products;

public class Book extends Item {
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn, String genre, double price, int quantity) {
        this.setTitle(title);
        this.author = author;
        this.isbn = isbn;
        this.setGenre(genre);
        this.setPrice(price);
        this.setQuantity(quantity);
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


}
