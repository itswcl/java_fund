import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Order> orders = new ArrayList<Order>();

    public CoffeeKiosk() {};

    public void addMenuItem(int index, String name, double price) {
        // String name = System.console().readLine();

        items.add(new Item(index, name, price));
    }

    public void displayMenu() {

        for (Item item: items) {
            System.out.println(item.getIndex() + " " + item.getItemName() + " $" + item.getItemPrice());
        }
    }

    public void newOrder() {

    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

    	// Your code:
        // Create a new order with the given input string
        Order newOrder = new Order(name);
        // Show the user the menu, so they can choose items to add.
        displayMenu();
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();

        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {

            // Get the item object from the menu, and add the item to the order
            for (Item item : items) {

                if (itemNumber.equals(String.valueOf(item.getIndex()))) {
                    newOrder.addItem(item);
                };

            }
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
            // Ask them to enter a new item index or q again, and take their input
        }
        // After you have collected their order, print the order details
    	// as the example below. You may use the order's display method.
        System.out.println("Your Total is $" + newOrder.getOrderTotal());
    }


    public ArrayList<Item> getArrayItem() {
        return this.items;
    }

    public ArrayList<Order> getOrderItem() {
        return this.orders;
    }
}
