package hexlet.code.games;

import hexlet.code.Engine;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static hexlet.code.Engine.NUMBQUESTIONS;

public class Even {
    public static boolean evenGcd(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void evenGame() {
        String taskText = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        List<SimpleEntry<String, String>> rounds = new ArrayList<>();
        String currExpression = "";
        String currResult = "";

        for (int i = 0; i < NUMBQUESTIONS; ++i) {
            currExpression = String.valueOf(new Random().nextInt(100) + 1);
            int theNumber;
            theNumber = Integer.parseInt(currExpression);
            if (evenGcd(theNumber)) {
                currResult = "yes";
            } else {
                currResult = "no";
            }
            rounds.add(new SimpleEntry<>(currExpression, currResult));
        }
        Engine.getStart(taskText, rounds);
    }
}
