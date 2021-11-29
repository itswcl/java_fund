public class primi_vs_object {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // Integer sum = 0; object is the pointer / each loop we create instance which takes longer time
        // object can hold null as nothing
        // Primitive cant hold null
        int sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += 1;
        }

        System.out.println("Sum: " + sum);

        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;

        System.out.println("Time of execution " + total + " seconds");
    }
}
