public class Order {

    Consumer consumer;
    Product product;
    int amount;

    public Order(Consumer consumer, Product product, int amount) {
        this.consumer = consumer;
        this.product = product;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Order{Consumer: " + consumer + ", Product: " + product + ", Amount: " + amount);
    }
}
