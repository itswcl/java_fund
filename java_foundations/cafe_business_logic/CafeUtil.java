import java.util.ArrayList;
import java.util.Arrays;


public class CafeUtil {

    // int getStreakGoal()
    public int getStreakGoal() {
        int sum = 0;
        int week = 0;
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

    // printPriceChart


    // void displayMenu(ArrayList<String> menuItems)


    // addCustomer(ArrayList<String>)


}