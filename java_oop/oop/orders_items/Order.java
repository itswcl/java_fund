import java.util.ArrayList;

public class Order {
    private String name;
    // private double total;
    private boolean ready;
    private ArrayList<Item> items;

    // Constructor without argument
    public Order () {
        setOrderName("Guest");
        setOrderItems();
    }


    // Overloaded constructor
    public Order (String name) {
        setOrderName(name);
        setOrderItems();
    }


    // Order Methods
    public void addItem(Item item) {
        items.add(item);
    }

    public String getStatusMessage() {
        if (getOrderReady() == true) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public int getOrderTotal() {
        int total = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getItemPrice();
        }
        return total;
    }

    public void display() {
        System.out.println(getOrderName());

        for (int i = 0; i < items.size(); i++) {
            String itemName = items.get(i).getItemName();
            double itemPrice = items.get(i).getItemPrice();

            System.out.println(itemName + " - " + itemPrice);
        }

        System.out.println("Total: $" + getOrderTotal());
    }


    // setter / getter
    // set order name
    public void setOrderName(String orderName) {
        this.name = orderName;
    }
    // get order name
    public String getOrderName() {
        return this.name;
    }


    // // set order total
    // public void setOrderTotal() {
    //     // this.total = 0;
    //     for (int i = 0; i < items.size(); i++) {
    //         this.total += items.get(i).getItemPrice();
    //     }
    // }
    // // get order total
    // public double getOrderTotal() {
    //     return this.total;
    // }


    // set ready
    public void setOrderReady(boolean bool) {
        this.ready = bool;
    }
    // get ready
    public boolean getOrderReady() {
        return ready;
    }


    // set items
    public void setOrderItems() {
        this.items = new ArrayList<Item>();
    }
    // get items
    public ArrayList<Item> getOrderItems() {
        return items;
    }
}
