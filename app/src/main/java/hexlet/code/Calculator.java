package hexlet.code;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static hexlet.code.Engine.NUMBQUESTIONS;


public class Calculator {
    private static int answer;

    public static int generateAnswer(int numb1, int numb2, String operand) {
        if (operand.equals("+")) {
            answer = numb1 + numb2;
        } else if (operand.equals("-")) {
            answer = numb1 - numb2;
        } else {
            answer = numb1 * numb2;
        }
        return answer;
    }

    public static void makeCalculator() {
        String taskText = "What is the result of the expression?";
        String[] operate = new String[]{"+", "-", "*"};
        List<SimpleEntry<String, String>> rounds = new ArrayList<>();

        for (int i = 0; i < NUMBQUESTIONS; ++i) {
            int numbExp = (int) (Math.random() * 3);  // случайный выбор операнда
            int numb1 = new Random().nextInt(100) + 1;
            int numb2 = new Random().nextInt(100) + 1;
            String operand = operate[numbExp];
            String currExpression = numb1 + " " + operand + " " + numb2;

            String currResult = "";
            currResult = String.valueOf(generateAnswer(numb1, numb2, operand));
            rounds.add(new SimpleEntry<>(currExpression, currResult));
        }

        Engine.getStart(taskText, rounds);
    }
}
