import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Shop {

    public static ArrayList<Consumer> createConsumer() {
        ArrayList<Consumer> consumers = new ArrayList<>();

        consumers.add(new Consumer("Ivan", "Ivanov", "Ivanovich", 1990, "1"));
        consumers.add(new Consumer("Vasilisa", "Vasilievna", "Ivanovna", 2000, "2"));

        return consumers;
    }

    public static ArrayList<Product> createProduct() {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Ball", 100));
        products.add(new Product("Notebook", 100000));
        products.add(new Product("Phone", 50000));
        products.add(new Product("TV", 25500));
        products.add(new Product("Desk", 10000));

        return products;
    }

    public static ArrayList<Order> createOrder() {
        ArrayList<Order> orders = new ArrayList<>(5);

        return orders;
    }

    public static Order buy(ArrayList<Consumer> consumers, Consumer who, ArrayList<Product> products, Product what, int howMuch) {
        if (!existsConsumer(consumers, who))
            throw new CustomerException("Unknown customer: " + who);
        if (!existsProduct(products, what))
            throw new ProductException("Unknown product: " + what);
        if (howMuch < 0 || howMuch > 100)
            throw new AmountException("Incorrect amount " + howMuch);
        return new Order(who, what, howMuch);
    }

    public static boolean existsConsumer(ArrayList<Consumer> consumers, Consumer human) {
        return consumers.contains(human);
    }

    public static boolean existsProduct(ArrayList<Product> products, Product product) {
        return products.contains(product);
    }

}
