import java.util.ArrayList;
import java.util.Arrays;


public class CafeUtil {

    // int getStreakGoal()
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        int week = numWeeks;
        while (week <= 10) {
            sum += week;
            week++;
        }
        return sum;
    }

    // double getOrderTotal(double[] prices)
    public double getOrderTotal(double[] prices) {
        double sum = 0;

        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum;
    }

    // void displayMenu(ArrayList<String> menuItems)
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            // System.out.println(i + " " + menuItems.get(i));
            System.out.println(String.format("%s %s", i, menuItems.get(i)));
        }
    }

    // addCustomer(ArrayList<String>)
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();

        System.out.println("Hello, " + userName);
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);

        System.out.println(customers);
    }

    // addCustomers(ArrayList<String>)
    public void addCustomers(ArrayList<String> custoemrs) {
        System.out.println("Please enter your name and other's name:");
        String userName = System.console().readLine();
    }

    // void printPriceChart(String product, double price, int maxQuantity)
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            System.out.println(i + " - $" + (i * price - ((i - 1) * 0.5)));
        }
    }

    // boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices)
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() == prices.size()) {
            for (int i = 0; i < menuItems.size(); i++) {
                // System.out.println(i + " " + menu.get(i) + " -- $" + price.get(i));
                System.out.println(String.format("%d %s -- $%.2f", i, menuItems.get(i), prices.get(i)));
            }
        }
        return menuItems.size() == prices.size();
    }
}