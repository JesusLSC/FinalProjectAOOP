package Products.Factories;

import Orders.Customer;

public class CustomerFactory {
    public static Customer createCustomer(String name, String email, String address) {
        if (name == null || name.isEmpty() || email == null || email.isEmpty() || address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Invalid customer details");
        }
        return new Customer(name, email, address);
    }
}