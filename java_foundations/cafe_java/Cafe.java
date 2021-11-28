public class Cafe {
    public static void main(String[] args) {
    // App variables
    // text appear in the app
    String generalGreeting = "Welcome to Cafe Java, ";
    String pendingMessage = ", your order will be ready shortly";
    String readyMessage = ", your order is ready";
    String displayTotalMessage = "Your total is $";

    // Menu variable
    double mochaPrice = 3.5;
    double dripPrice = 2;
    double lattePrice = 5.5;
    double cappuccinoPrice = 3;

    // Customer name variable
    String customer1 = "Cindhuri";
    String customer2 = "Sam";
    String customer3 = "Jimmy";
    String customer4 = "Noah";

    // Order completion
    boolean isReadyOrder1 = true;
    boolean isReadyOrder2 = true;
    boolean isReadyOrder3 = false;
    boolean isReadyOrder4 = false;

    // app interaction simulation
    // eg. "Welcome to Cafe Java, Cindhuri"

    System.out.println(generalGreeting + customer1);
    System.out.println(customer1 + pendingMessage);

    System.out.println(displayTotalMessage + (lattePrice * 2));
    isReadyOrder2 = false;
    if (isReadyOrder2) {
        System.out.println(customer2 + readyMessage);
    } else {
        System.out.println(customer2 + pendingMessage);
    }

    System.out.println(customer3 + pendingMessage);
    System.out.println(displayTotalMessage + (dripPrice - lattePrice));

    if (isReadyOrder4) {
        System.out.println(customer4 + readyMessage);
        System.out.println(displayTotalMessage + cappuccinoPrice);
    }

    }
}