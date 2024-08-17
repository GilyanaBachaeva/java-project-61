package hexlet.code.games;

import hexlet.code.Engine;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static hexlet.code.Engine.NUMBQUESTIONS;


public class Calculator {

    public static int generateExpression(int numb1, int numb2, String operand) throws Error {
        int answer;
        answer = switch (operand) {
            case "+" -> numb1 + numb2;
            case "-" -> numb1 - numb2;
            case "*" -> numb1 * numb2;
            default -> throw new Error("Unknown operand");
        };
        return answer;
    }

    public static void makeCalculator() {
        final String taskText = "What is the result of the expression?";
        final int limitOfComputing = 100;
        final String[] operate = new String[]{"+", "-", "*"};
        final List<SimpleEntry<String, String>> rounds = new ArrayList<>();
        final int numbOfOperand = 3;
        final int numbExp = (int) (Math.random() * numbOfOperand);

        for (int i = 0; i < NUMBQUESTIONS; ++i) {
            int numb1 = new Random().nextInt(limitOfComputing) + 1;
            int numb2 = new Random().nextInt(limitOfComputing) + 1;
            String operand = operate[numbExp];
            String currExpression = numb1 + " " + operand + " " + numb2;

            String currResult = "";
            currResult = String.valueOf(generateExpression(numb1, numb2, operand));
            rounds.add(new SimpleEntry<>(currExpression, currResult));
        }

        Engine.getStart(taskText, rounds);
    }
}
