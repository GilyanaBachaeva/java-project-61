package hexlet.code.games;

import hexlet.code.Engine;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static hexlet.code.Engine.NUMBQUESTIONS;

public class Prime {
    public static boolean primeStatus(int number) {
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
        final String taskText = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final List<SimpleEntry<String, String>> rounds = new ArrayList<>();
        final int limitOfComputing = 100;

        String currExpression = "";
        String currResult = "";

        for (int i = 0; i < NUMBQUESTIONS; ++i) {
            currExpression = String.valueOf(new Random().nextInt(limitOfComputing) + 1);
            int theNumber;
            theNumber = Integer.parseInt(currExpression);
            if (primeStatus(theNumber)) {
                currResult = "yes";
            } else {
                currResult = "no";
            }
            rounds.add(new SimpleEntry<>(currExpression, currResult));
        }
        Engine.getStart(taskText, rounds);
    }
}
