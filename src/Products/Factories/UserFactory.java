package Products.Factories;
import Orders.User;

public class UserFactory {
    public static User createUser(String fName, String lName, String email, String address, String phoneNumber) {
        return new User(fName, lName, email, address, phoneNumber);
    }
}
