import java.util.ArrayList;

public class Order {
    private String name;
    private double total;
    private boolean ready;
    public ArrayList<Item> items = new ArrayList<Item>();


    public Order (String orderName) {
        setOrderName(orderName);
    }

    // set order name
    public void setOrderName(String orderName) {
        this.name = orderName;
    }
    // get order name
    public String getOrderName() {
        return this.name;
    }


    // set order total
    public void setOrderTotal() {
        // this.total = 0;
        for (int i = 0; i < items.size(); i++) {
            this.total += items.get(i).getItemPrice();
        }
    }
    // get order total
    public double getOrderTotal() {
        return this.total;
    }


    // set ready
    public void setOrderReady(boolean bool) {
        this.ready = bool;
    }
    // get ready
    public boolean getOrderReady() {
        return ready;
    }


    // // set items
    // public void setOrderItems(ArrayList<Object> item) {
    //     this.items.add(new );
    // }
    // // get items
    // public ArrayList<Object> getOrderItems() {
    //     return items;
    // }
}
