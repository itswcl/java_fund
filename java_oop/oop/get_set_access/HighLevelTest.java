public class HighLevelTest {
    public static void main(String[] args) {
        HighLevel bike = new HighLevel();
        HighLevel car = new HighLevel();

        bike.setNumberOfWheels(2);
        bike.setColor("red");

        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();

        car.setNumberOfWheels(4);
        car.setColor("blue");

        int carWheels = car.getNumberOfWheels();
        String carColor = car.getColor();

        System.out.println("Bike - Wheels " + bikeWheels + " Color " + bikeColor);
        System.out.println("Car - Wheels " + carWheels + " Color " + carColor);

    }
}
