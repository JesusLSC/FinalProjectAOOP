import Products.Book;
import Products.Factories.CustomerFactory;
import Products.Factories.UserFactory;
import Products.Magazine;
import Products.Newspaper;
import Products.Factories.Type;
import Products.Factories.ItemFactory;
import Orders.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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


////////////////////////////////////////////  GUI SECTION  //////////////////////////////////////////////////////////////////////////


        JFrame frame = new JFrame("Marvella Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JLabel label = new JLabel("Marvella Library Management System");
        JButton registerButton = new JButton("Register New User");

        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.NORTH);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame registrationFrame = new JFrame("User Registration");
                registrationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                registrationFrame.setSize(400, 300);
                JTextField[] textFields = new JTextField[5];
                for (int i = 0; i < 5; i++) {
                    textFields[i] = new JTextField(20);
                    registrationFrame.add(textFields[i]);
                }

                JButton submitButton = new JButton("Submit");
                registrationFrame.add(submitButton, BorderLayout.SOUTH);

                registrationFrame.setLayout(new GridLayout(6, 1));

                registrationFrame.setVisible(true);
            }
        });

        Dimension buttonSize = new Dimension(15, 5);
        registerButton.setPreferredSize(buttonSize);

        frame.add(registerButton, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
