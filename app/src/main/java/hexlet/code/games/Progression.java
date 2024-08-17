package hexlet.code.games;

import hexlet.code.Engine;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static hexlet.code.Engine.NUMBQUESTIONS;

public class Progression {
    public static List<Integer> generateProgressionLine(int step, int start, int sizeOfProgressionLine) {
        List<Integer> expression = new ArrayList<>();
        expression.add(start);
        for (int i = 0; i < sizeOfProgressionLine; i++) {
            expression.add(expression.get(i) + step);
        }
        return expression;
    }

    public static void findProgression() {
        final String taskText = "What number is missing in the progression?";
        final List<SimpleEntry<String, String>> rounds = new ArrayList<>();
        final int limitOfComputing = 8;
        final int step = new Random().nextInt(limitOfComputing) + 1;
        final int start = 2;
        final int sizeOfProgressionLine = 9;

        for (int i = 0; i < NUMBQUESTIONS; ++i) {
            List<Integer> expression = generateProgressionLine(step, start, sizeOfProgressionLine);
            int index = new Random().nextInt(sizeOfProgressionLine);
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
        Engine.getStart(taskText, rounds);
    }
}
