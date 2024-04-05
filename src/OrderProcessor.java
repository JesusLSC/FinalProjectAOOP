public class OrderProcessor {
    private OrderMediator orderMediator;

    public OrderProcessor(OrderMediator orderMediator) {
        this.orderMediator = orderMediator;
    }

    public void processOrder(Order order) {
        orderMediator.processOrder(order);
    }
}

