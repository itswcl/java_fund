import java.util.ArrayList;

class FixedArray {
    public static void main(String[] args) {
        // add, clear, clone, contains, get, indexOf, isEmpty, remove, size

        ArrayList<Integer> myList = new ArrayList<Integer>();

        myList.add(10);
        myList.add(11);

        // getters and setters
        Integer num = myList.get(0);
        System.out.println(num);

        myList.set(0, 9);
        System.out.println(myList);

        //
        ArrayList<Object> things = new ArrayList<Object>();
        things.add(10);
        things.add("Hello");
        things.add(new ArrayList<Integer>());
        things.add(12.5);

        System.out.println(things);


        // int[] myArray = new int[5];
        // for (int i = 0; i < myArray.length; i++) {
        //     System.out.println(myArray[i]);
        // }

        // String[] fruits = {"banana", "pear", "papaya", "kiwi"};
        // String temp = fruits[0];
        // fruits[0] = fruits[fruits.length - 1];
        // fruits[fruits.length - 1] = temp;

        // for (int i = 0; i < fruits.length; i++) {
        //     System.out.println(fruits[i]);
        // }

        int i = 0;
        while (i < 7) {
            System.out.println("foo" + i);
            i++;
        }

        for (int j = 0; j < 7; j++) {
            System.out.println("bar" + j);
        }

        ArrayList<String> dynamicArray = new ArrayList<String>();
        dynamicArray.add("Hello");
        dynamicArray.add("World");
        dynamicArray.add("etc");

        for (int k = 0; k < dynamicArray.size(); k++) {
            String name = dynamicArray.get(k);
            System.out.println("hello" + name);
        }

        // for (element container : collection)
        for (String name : dynamicArray) {
            System.out.println("Hi" + name);
        }

        ArrayList<String> snacks = new ArrayList<String>();
        snacks.add("Apples");
        snacks.add("Pretzels");
        snacks.add("Almonds");
        snacks.add("Yogurt");

        // for (String snack : snacks) {
        //     if (snack.charAt(0) == 'A') {
        //         snacks.remove(snack);
        //     }
        // }

        for (int a = 0; a < snacks.size(); a++) {
            if (snacks.get(a).charAt(0) == 'A') {
                snacks.remove(a);
            }
        }
    }
}