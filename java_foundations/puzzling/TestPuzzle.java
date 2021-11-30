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


        System.out.println("\n -------- Get New Password Set Test -------");
        System.out.println("Random Password Set: " + appTest.getNewPasswordSet(5));


        System.out.println("\n -------- Shuffle Array Test -------");
        ArrayList<String> words = new ArrayList<String>();
        words.add(appTest.generatePassword());
        words.add(appTest.generatePassword());
        words.add(appTest.generatePassword());

        System.out.println("Original Array: " + words);
        System.out.println("shuffle Array: " + appTest.shuffleArray(words));

    }
}
