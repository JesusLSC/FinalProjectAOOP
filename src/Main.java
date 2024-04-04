import Products.*;

public class Main {
    public static void main(String[] args) {
        Item book = ItemFactory.createItem(Type.Book, "Java Programming", "Computer Science", 29.99, 10, "John Doe", "1234567890");

        Item magazine = ItemFactory.createItem(Type.Magazine, "Tech Weekly", "Technology", 5.99, 100,"","");

        Item newspaper = ItemFactory.createItem(Type.Newspaper, "Daily News", "News", 2.99, 200,"","");
    }
}