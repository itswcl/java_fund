public class HighLevel {
    private int numberOfWheels;
    private String color;

    public HighLevel() {

    }

    public HighLevel(String color) {
        this.color = color;
    }

    public HighLevel(String color, int num) {
        this.color = color;
        this.numberOfWheels = num;
    }

    // // getter
    // public int getNumberOfWheels() {
    //     return numberOfWheels;
    // }

    // // setter
    // public void setNumberOfWheels(int number) {
    //     numberOfWheels = number;
    // }

    // getter
    public String getColor() {
        return color;
    }

    // // setter
    // public void setColor(String color) {
    //     this.color = color;
    // }
}