import Products.*;
import Products.Factories.*;
import Orders.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a user
        User user = UserFactory.createUser("John", "Doe", "john.doe@example.com", "123 Main St", "555-1234");

        // Create some items using explicit call
        Book book = (Book) ItemFactory.createItem(Type.Book, "Java Programming", "Computer Science", 29.99, 10, "John Doe", 1234567890);
        Magazine magazine = (Magazine) ItemFactory.createItem(Type.Magazine, "Tech Weekly", "Technology", 5.99, 100, "", 0);
        Newspaper newspaper = (Newspaper) ItemFactory.createItem(Type.Newspaper, "Daily News", "News", 2.99, 200, "", 0);

        // Create a customer
        Customer customer = CustomerFactory.createCustomer("Dara", "best.proffessor@world.com", "456 Elm St");



        // Create a concrete order builder
        ConcreteOrderBuilder orderBuilder = new ConcreteOrderBuilder();

        // Create an order mediator
        OrderMediator orderMediator = new OrderMediator(new Inventory());

        // Create an orders engineer
        OrdersEngineer ordersEngineer = new OrdersEngineer(orderBuilder, orderMediator);

        // Create lists of items
        List<Book> books = new ArrayList<>();
        books.add(book);

        List<Magazine> magazines = new ArrayList<>();
        magazines.add(magazine);

        List<Newspaper> newspapers = new ArrayList<>();
        newspapers.add(newspaper);

        // Build the order
        Order order = ordersEngineer.createOrder(customer, books, magazines, newspapers, user.getUserId());

        // Process the order
        ordersEngineer.processOrder(order);

        // Display order details
        Order.displayOrder(order);
    }
}
