package hexlet.code.games;

import hexlet.code.Engine;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static hexlet.code.Engine.NUMBQUESTIONS;

public class Even {
    private static final String TASK_TEXT = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int LIMIT_OF_COMPUTING = 100;

    private static boolean evenStatus(int number) {
        return number % 2 == 0;
    }

    public static void evenGame() {
        final List<SimpleEntry<String, String>> rounds = new ArrayList<>();

        String currExpression = "";
        String currResult = "";

        for (int i = 0; i < NUMBQUESTIONS; ++i) {
            currExpression = String.valueOf(new Random().nextInt(LIMIT_OF_COMPUTING) + 1);
            int theNumber;
            theNumber = Integer.parseInt(currExpression);
            if (evenStatus(theNumber)) {
                currResult = "yes";
            } else {
                currResult = "no";
            }
            rounds.add(new SimpleEntry<>(currExpression, currResult));
        }
        Engine.getStart(TASK_TEXT, rounds);
    }
}
