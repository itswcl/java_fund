
public class Item {
    private String name;
    private double price;

    public Item (String name, double price) {
        setItemName(name);
        setItemPrice(price);
    }

    // Setter and Getter

    // Setter for price
    public void setItemName(String name) {
        this.name = name;
    }
    // Getting for name
    public String getItemName() {
        return name;
    }

    // Setter for price
    public void setItemPrice(double price) {
        this.price = price;
    }
    // Getting for name
    public double getItemPrice() {
        return price;
    }


}