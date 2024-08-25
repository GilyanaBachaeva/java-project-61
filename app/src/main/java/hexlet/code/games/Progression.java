package hexlet.code.games;

import hexlet.code.Engine;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static hexlet.code.Engine.NUMBQUESTIONS;

public class Progression {
    private static final String TASK_TEXT = "What number is missing in the progression?";
    private static final int LIMIT_OF_COMPUTING = 8;
    private static final int STEP = new Random().nextInt(LIMIT_OF_COMPUTING) + 1;
    private static final int START = 2;
    private static final int SIZE_OF_PROGRESSION_LINE = 9;

    private static List<Integer> generateProgressionLine(int step, int start, int sizeOfProgressionLine) {
        List<Integer> expression = new ArrayList<>();
        expression.add(start);
        for (int i = 0; i < sizeOfProgressionLine; i++) {
            expression.add(expression.get(i) + step);
        }
        return expression;
    }

    public static void findProgression() {
        final List<SimpleEntry<String, String>> rounds = new ArrayList<>();

        for (int i = 0; i < NUMBQUESTIONS; ++i) {
            List<Integer> expression = generateProgressionLine(STEP, START, SIZE_OF_PROGRESSION_LINE);
            int index = new Random().nextInt(SIZE_OF_PROGRESSION_LINE);
            int hideNumb = expression.get(index);
            String currExpression = "";
            for (int numb : expression) {
                if (numb != hideNumb) {
                    currExpression += String.valueOf(numb) + " ";
                } else {
                    currExpression += ".." + " ";
                }
            }

            rounds.add(new SimpleEntry<>(currExpression, String.valueOf(hideNumb)));
        }
        Engine.getStart(TASK_TEXT, rounds);
    }
}
