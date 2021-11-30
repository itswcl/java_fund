import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleJava appTest = new PuzzleJava();

        /* ============ App Test Cases ============= */

        System.out.println("\n -------- Get Ten Rolls Test -------");
        System.out.println("Rolling" + appTest.getTenRolls(20));


        System.out.println("\n -------- Get Random Letter Test -------");
        System.out.println("Random Letter: " + appTest.getRandomLetter());


        System.out.println("\n -------- GeneratePassword Test -------");
        System.out.println("Random Password: " + appTest.generatePassword());

    }
}
