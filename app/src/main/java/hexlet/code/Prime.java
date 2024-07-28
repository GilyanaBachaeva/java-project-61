package hexlet.code;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Prime {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void gamePrime() {
        String taskText = "Answer 'yes' if given number is prime. Otherwise answer 'no'";

        List<SimpleEntry<String, String>> rounds = new ArrayList<>();
        String currExpression = "";
        String currResult = "";

        for (int i = 0; i < 3; ++i) {
            currExpression = String.valueOf(new Random().nextInt(100) + 1);
            int theNumber;
            theNumber = Integer.parseInt(currExpression);
            if (isPrime(theNumber)) {
                currResult = "yes";
            } else {
                currResult = "no";
            }
            rounds.add(new SimpleEntry<>(currExpression, currResult));
        }
        Engine.getStart(taskText, rounds);
    }
}
