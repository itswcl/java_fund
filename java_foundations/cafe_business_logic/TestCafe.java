import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestCafe {
    public static void main(String[] args) {

    /*
        You will need add 1 line to this file to create an instance of the CafeUtil class.
        Hint: it will need to correspond with the variable name used below..
    */
    CafeUtil appTest = new CafeUtil();

        /* ============ App Test Cases ============= */

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal(1));
        System.out.printf("Purchases needed by week 9: %s \n\n", appTest.getStreakGoal(2));
        System.out.printf("Purchases needed by week 8: %s \n\n", appTest.getStreakGoal(3));
        System.out.printf("Purchases needed by week 7: %s \n\n", appTest.getStreakGoal(4));
        System.out.printf("Purchases needed by week 6: %s \n\n", appTest.getStreakGoal(5));
        System.out.printf("Purchases needed by week 5: %s \n\n", appTest.getStreakGoal(6));
        System.out.printf("Purchases needed by week 4: %s \n\n", appTest.getStreakGoal(7));
        System.out.printf("Purchases needed by week 3: %s \n\n", appTest.getStreakGoal(8));
        System.out.printf("Purchases needed by week 2: %s \n\n", appTest.getStreakGoal(9));
        System.out.printf("Purchases needed by week 1: %s \n\n", appTest.getStreakGoal(10));

        System.out.println("----- Order ¡Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");

        List<String> loadMenu = Arrays.asList(
            "drip coffee",
            "cappucino",
            "latte",
            "mocha"
        );
        ArrayList<String> menu = new ArrayList<String>();
        menu.addAll(loadMenu);
        appTest.displayMenu(menu);

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }


        System.out.println("\n----- Print Price Chart Test-----");
        appTest.printPriceChart("Columbian Coffee Grounds", 15, 3);


        System.out.println("\n----- Display Menu Test with overload-----");

        // List<String> loadMenu = Arrays.asList(
        //     "drip coffee",
        //     "cappucino",
        //     "latte",
        //     "mocha"
        // );
        // ArrayList<String> menu = new ArrayList<String>();
        // menu.addAll(loadMenu);

        List<Double> loadPrices = Arrays.asList(
            1.50,
            3.50,
            4.50,
            3.50
        );
        ArrayList<Double> price = new ArrayList<Double>();
        price.addAll(loadPrices);

        if (appTest.displayMenu(menu, price)) {
            for (int i = 0; i < menu.size(); i++) {
                // System.out.println(i + " " + menu.get(i) + " -- $" + price.get(i));
                System.out.println(String.format("%d %s -- $%.2f", i, menu.get(i), price.get(i)));
            }
        };
    }
}
