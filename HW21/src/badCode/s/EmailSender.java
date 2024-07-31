package badCode.s;

class EmailSender {
    private Order order;

    public EmailSender(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void sendEmailConfirmation() {
        // отправка подтверждения заказа по электронной почте
    }
}
