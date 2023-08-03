import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        ArrayList<Consumer> consumers = Shop.createConsumer();

        ArrayList<Product> products = Shop.createProduct();

        ArrayList<Order> orders = Shop.createOrder();

        Object[][] info = {
                {consumers.get(0), products.get(0), 1},
                {consumers.get(1), products.get(1), -1},
                {consumers.get(0), products.get(2), 150},
                {consumers.get(1), new Product("Flower", 10), 1},
                {new Consumer("Fedor", "Fedorov", "Fedorovich", 1940, "3")},
        };

        int capacity = 0;
        int i = 0;

        while (capacity != orders.size() || i != info.length - 1) {
            try {
                orders.add(capacity, Shop.buy(consumers, (Consumer) info[i][0], products,
                        (Product) info[i][1], (int) info[i][2]));
                System.out.println(orders);
                capacity++;
            } catch (ProductException e) {
                e.printStackTrace();
            } catch (AmountException e) {
                orders.add(capacity++, Shop.buy(consumers, (Consumer) info[i][0], products,
                        (Product) info[i][1], 1));
            } catch (CustomerException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Orders made: " + capacity);
            }
            ++i;
        }

    }

}
