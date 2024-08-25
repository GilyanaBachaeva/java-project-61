package hexlet.code.games;

import hexlet.code.Engine;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static hexlet.code.Engine.NUMBQUESTIONS;

public class Prime {
    private static final String TASK_TEXT = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int LIMIT_OF_COMPUTING = 100;

    private static boolean primeStatus(int number) {
        if (number <= 1) {
            return true;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void gamePrime() {
        final List<SimpleEntry<String, String>> rounds = new ArrayList<>();

        String currExpression = "";
        String currResult = "";

        for (int i = 0; i < NUMBQUESTIONS; ++i) {
            currExpression = String.valueOf(new Random().nextInt(LIMIT_OF_COMPUTING) + 1);
            int theNumber;
            theNumber = Integer.parseInt(currExpression);
            if (primeStatus(theNumber)) {
                currResult = "yes";
            } else {
                currResult = "no";
            }
            rounds.add(new SimpleEntry<>(currExpression, currResult));
        }
        Engine.getStart(TASK_TEXT, rounds);
    }
}
