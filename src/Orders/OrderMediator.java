package Orders;

import Products.*;
import Products.Item;

public class OrderMediator {
    private Inventory inventory;

    public OrderMediator(Inventory inventory) {
        this.inventory = inventory;
    }

    public void processOrder(Order order) {
        updateInventory(order);
        System.out.println("Order processed successfully.");
    }

    private void updateInventory(Order order) {
        for (Item item : order.getItems()) {
            if (item instanceof Book) {
                inventory.removeBook((Book) item);
            } else if (item instanceof Magazine) {
                inventory.removeMagazine((Magazine) item);
            } else if (item instanceof Newspaper) {
                inventory.removeNewspaper((Newspaper) item);
            }
        }
    }

    public void calculateTotalPrice(Order order) {
        double totalPrice = 0.0;

        for (Item item : order.getItems()) {
            totalPrice += item.getPrice();
        }
        order.setTotalPrice(totalPrice);
    }
}
