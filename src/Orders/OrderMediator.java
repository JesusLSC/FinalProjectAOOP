package Orders;

import Products.*;

import java.util.List;

public class OrderMediator {
    private Inventory inventory;

    public OrderMediator(Inventory inventory) {
        this.inventory = inventory;
    }

    public void processOrder(Order order) {
        updateInventory(order);
        System.out.println("Order processed successfully.");
    }

    public void updateInventory(Order order) {
        for (Book book : order.getBooks()) {
            inventory.removeBook(book);
        }
        for (Magazine magazine : order.getMagazines()) {
            inventory.removeMagazine(magazine);
        }
        for (Newspaper newspaper : order.getNewspapers()) {
            inventory.removeNewspaper(newspaper);
        }
    }

    public double calculateTotalPrice(List<Book> books, List<Magazine> magazines, List<Newspaper> newspapers) {
        double totalPrice = 0.0;

        for (Book book : books) {
            totalPrice += book.getPrice();
        }

        for (Magazine magazine : magazines) {
            totalPrice += magazine.getPrice();
        }

        for (Newspaper newspaper : newspapers) {
            totalPrice += newspaper.getPrice();
        }

        return totalPrice;
    }
}
