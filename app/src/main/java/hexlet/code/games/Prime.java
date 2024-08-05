package hexlet.code.games;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static hexlet.code.games.Engine.NUMBQUESTIONS;

public class Prime {
    public static String primeGcd(int number) {
        if (number <= 1) {
            return "no";
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

    public static void gamePrime() {
        String taskText = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        List<SimpleEntry<String, String>> rounds = new ArrayList<>();
        String currExpression = "";
        String currResult = "";

        for (int i = 0; i < NUMBQUESTIONS; ++i) {
            currExpression = String.valueOf(new Random().nextInt(100) + 1);
            int theNumber;
            theNumber = Integer.parseInt(currExpression);
            currResult = primeGcd(theNumber);

            rounds.add(new SimpleEntry<>(currExpression, currResult));
        }
        Engine.getStart(taskText, rounds);
    }
}
