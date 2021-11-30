import java.util.ArrayList;
import java.util.Scanner;


public class ListException {

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {

            try {

                Integer castedValue = (Integer) myList.get(i);

            } catch (Exception e) {
                System.out.println("index " + i + " Error in index of value is not an integer");
            }
        }


    }
}