
public class Item {
    private String name;
    private double price;
    private int index;

    public Item (int index, String name, double price) {
        setItemName(name);
        setItemPrice(price);
        setIndex(index);
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


    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

}