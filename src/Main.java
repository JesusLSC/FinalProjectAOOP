import Products.Book;
import Products.Factories.CustomerFactory;
import Products.Factories.UserFactory;
import Products.Magazine;
import Products.Newspaper;
import Products.Factories.Type;
import Products.Factories.ItemFactory;
import Orders.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = UserFactory.createUser("Jesus", "Vazquez", "jesus.vazquez@gmail.com", "555 Melt St.", "5149770747");

        // Create some items using explicit casting
        Book javaProgramming = (Book) ItemFactory.createItem(Type.Book, "Java Programming", "Computer Science", 29.99, 10, "John Doe", 1234567890);
        Magazine techWeekly = (Magazine) ItemFactory.createItem(Type.Magazine, "Tech Weekly", "Technology", 5.99, 100, "", 0);
        Newspaper dailyNews = (Newspaper) ItemFactory.createItem(Type.Newspaper, "Daily News", "News", 2.99, 200, "", 0);

        // Create a customer
        Customer customer = CustomerFactory.createCustomer("Dara", "best.professor@IamCool.com", "2015 Beverly Hills");

        // Create a concrete order builder
        ConcreteOrderBuilder orderBuilder = new ConcreteOrderBuilder();

        // Create an order mediator
        OrderMediator orderMediator = new OrderMediator(new Inventory());

        // Create an orders engineer
        OrdersEngineer ordersEngineer = new OrdersEngineer(orderBuilder, orderMediator);

        // Create lists of items
        List<Book> books = new ArrayList<>();
        books.add(javaProgramming);

        List<Magazine> magazines = new ArrayList<>();
        magazines.add(techWeekly);

        List<Newspaper> newspapers = new ArrayList<>();
        newspapers.add(dailyNews);

        // Calculate total price
        double totalPrice = orderMediator.calculateTotalPrice(books, magazines, newspapers);

        System.out.println(totalPrice);
        for(int i = 0; i< books.size(); i++){
            System.out.println(books.get(i).getPrice());
        }
        for(int i = 0; i< magazines.size(); i++){
            System.out.println(magazines.get(i).getPrice());
        }
        for(int i = 0; i< newspapers.size(); i++){
            System.out.println(newspapers.get(i).getPrice());
        }

        // Create and process the order
       ordersEngineer.createOrder(customer, books, magazines, newspapers, totalPrice, 1524);


    }
}
