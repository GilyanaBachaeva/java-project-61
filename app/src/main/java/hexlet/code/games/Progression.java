package hexlet.code.games;

import hexlet.code.Engine;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static hexlet.code.Engine.NUMBQUESTIONS;

public class Progression {
    public static List<Integer> progressionGcd(int step, int start) {
        List<Integer> expression = new ArrayList<>();
        expression.add(start);
        for (int i = 0; i < 9; i++) {
            expression.add(expression.get(i) + step);
        }
        return expression;
    }

    public static void findProgression() {
        String taskText = "What number is missing in the progression?";

        List<SimpleEntry<String, String>> rounds = new ArrayList<>();

        for (int i = 0; i < NUMBQUESTIONS; ++i) {
            int step = new Random().nextInt(8) + 1;
            int start = 2;
            List<Integer> expression = progressionGcd(step, start);

            int index = new Random().nextInt(8);
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
