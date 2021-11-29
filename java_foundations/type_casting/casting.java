/**
 * casting
 */
public class casting {
    public static void main(String[] args) {
        // int i = 120;
        // byte b = i;
        // int > byte so error out

        // explicit
        // int i = 120;
        // int i = 130;
        // 130 wont work cuz out of range for byte
        // byte b = (byte) i; // range -128 - 127

        // implicit
        // byte < int so good eg. float < int
        byte b = 127;
        int i = b;
        System.out.println(i);
    }

}