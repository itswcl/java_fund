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

        Order order1 = new Order();
        order1.addItem(item1);
        order1.addItem(item2);

        Order order2 = new Order();
        order2.addItem(item3);
        order2.addItem(item4);

        Order order3 = new Order("Jimmy");
        order3.addItem(item1);
        order3.addItem(item3);

        Order order4 = new Order("Noah");
        order4.addItem(item2);
        order4.addItem(item4);

        Order order5 = new Order("Sam");
        order5.addItem(item1);
        order5.addItem(item4);

        System.out.println("------ get Status Message test ------");
        order2.setOrderReady(true);
        System.out.println(order2.getStatusMessage());

        System.out.println("\n------ get order total test ------");
        System.out.println(order1.getOrderTotal());

        System.out.println("\n------ display test ------");
        order3.display();

        // Order variables -- order1, order2 etc.
        // Order order1 = new Order("Cindhuri");
        // Order order2 = new Order("Jimmy");
        // Order order3 = new Order("Noah");
        // Order order4 = new Order("Sam");

        // order2.items.add(item1);
        // order2.setOrderTotal();

        // order3.items.add(item4);
        // order3.setOrderTotal();

        // order4.items.add(item2);
        // order4.setOrderTotal();

        // order1.setOrderReady(true);

        // order4.items.add(item2);
        // order4.items.add(item2);
        // order4.setOrderTotal();

        // order2.setOrderReady(true);

        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.getOrderName());
        // System.out.printf("Total: %s\n", order1.getOrderTotal());
        // System.out.printf("Ready: %s\n", order1.getOrderReady());

        // System.out.printf("Name: %s\n", order2.getOrderName());
        // System.out.printf("Total: %s\n", order2.getOrderTotal());
        // System.out.printf("Ready: %s\n", order2.getOrderReady());

        // System.out.printf("Name: %s\n", order3.getOrderName());
        // System.out.printf("Total: %s\n", order3.getOrderTotal());
        // System.out.printf("Ready: %s\n", order3.getOrderReady());

        // System.out.printf("Name: %s\n", order4.getOrderName());
        // System.out.printf("Total: %s\n", order4.getOrderTotal());
        // System.out.printf("Ready: %s\n", order4.getOrderReady());

    }
}
