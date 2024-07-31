package badCode.s;

public class OrderCalculator {
    Order order;

    public OrderCalculator(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderCalculator() {
    }

    public void calculateTotal() {
        // вычисление общей суммы заказа
    }
}
