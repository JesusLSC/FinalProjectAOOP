package Products.Factories;

import Orders.User;

public class UserFactory {
    public static User createUser(String fName, String lName, String email, String address, String phoneNumber) {
        if (fName == null || fName.isEmpty() || lName == null || lName.isEmpty() ||
                email == null || email.isEmpty() || address == null || address.isEmpty() ||
                phoneNumber == null || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Invalid user details");
        }
        return new User(fName, lName, email, address, phoneNumber);
    }
}