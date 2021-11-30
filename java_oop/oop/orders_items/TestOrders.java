import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item("mocha", 4.5);
        Item item2 = new Item("latte", 5);
        Item item3 = new Item("drip coffee", 2);
        Item item4 = new Item("cappuccino", 4);
        // System.out.println(item1.getItemName());
        // System.out.println(item1.getItemPrice());

        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        order2.items.add(item1);
        order2.setOrderTotal();

        order3.items.add(item4);
        order3.setOrderTotal();

        order4.items.add(item2);
        order4.setOrderTotal();

        order1.setOrderReady(true);

        order4.items.add(item2);
        order4.items.add(item2);
        order4.setOrderTotal();

        order2.setOrderReady(true);

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.getOrderName());
        System.out.printf("Total: %s\n", order1.getOrderTotal());
        System.out.printf("Ready: %s\n", order1.getOrderReady());
        System.out.printf("Total: %s\n", order2.getOrderTotal());
    }
}
