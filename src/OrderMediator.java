import Products.*;

public class OrderMediator {
    private Inventory inventory;

    public OrderMediator(Inventory inventory) {
        this.inventory = inventory;
    }

    public void processOrder(Order order) {
        updateInventory(order);
        double totalPrice = calculateTotalPrice(order);
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

    public double calculateTotalPrice(Order order) {
        double totalPrice = 0.0;

        for (Book book : order.getBooks()) {
            totalPrice += book.getPrice();
        }
        for (Magazine magazine : order.getMagazines()) {
            totalPrice += magazine.getPrice();
        }
        for (Newspaper newspaper : order.getNewspapers()) {
            totalPrice += newspaper.getPrice();
        }

        return totalPrice;
    }
}
