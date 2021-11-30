import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PuzzleJava {


    public ArrayList<Integer> getTenRolls(int number) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        Random randMachine = new Random();

        for (int i = 0; i < 10; i ++) {
            // int upperBound = 21;
            int randNum = randMachine.nextInt(20) + 1;

            list.add(randNum);
        }
        return list;
    }


    public Character getRandomLetter() {
        ArrayList<Character> letterList = new ArrayList<Character>();
        Random randMachine = new Random();

        List<Character> letters = Arrays.asList(
            'a','b','c','d','e','f','g','h','i','j','k',
            'l','m','n','o','p','q','r','s','t','u','v',
            'w','x','y','z'
        );
        letterList.addAll(letters);

        int upperBound = 26;
        int randNum = randMachine.nextInt(upperBound);

        return letterList.get(randNum);


        // Random rand = new Random();
        // String alphString = "abcdefghijklmnopqrstuvwxyz";
        // char randomChar = alphString.charAt(rand.nextInt(26));
        // return String.valueOf(randomChar);
    }


    public String generatePassword() {
        String result = "";

        for (int i = 0; i < 8; i++) {
            char letter = getRandomLetter();

            result += letter;
        }
        return result;
    }

    public ArrayList<String> getNewPasswordSet(int numberOfSet) {
        ArrayList<String> result = new ArrayList<String>();

        for (int i = 0; i < numberOfSet; i++) {
            result.add(generatePassword());
        }

        return result;
    }

    public ArrayList<String> shuffleArray(ArrayList<String> words) {
        ArrayList<String> list = new ArrayList<String>();
        Random randMachine = new Random();

        int upperBound = words.size();

        for (int i = 0; i < upperBound; i++) {
            int randNum = randMachine.nextInt(upperBound);
            list.add(i, words.get(randNum));
        }

        return list;
    }
}