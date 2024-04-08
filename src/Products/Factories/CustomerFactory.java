package Products.Factories;
import Orders.Customer;

public class CustomerFactory {
    public static Customer createCustomer(String name, String email, String address) {
        return new Customer(name, email, address);
    }
}
