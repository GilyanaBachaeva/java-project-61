package hexlet.code;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Calculator {
    public static void makeCalculator() {
        String taskText = "What is the result of the expression?";
        String[] operate = new String[]{"+", "-", "*"};
        List<SimpleEntry<String, String>> rounds = new ArrayList<>();

        for (int i = 0; i < 3; ++i) {
            int numbExp = (int) (Math.random() * 3);  // случайный выбор операнда
            int numb1 = new Random().nextInt(100) + 1;
            int numb2 = new Random().nextInt(100) + 1;

            String currExpression = numb1 + " " + operate[numbExp] + " " + numb2;

            String currResult = "";
            switch (operate[numbExp]) {
                case "+" -> {
                    currResult = String.valueOf(numb1 + numb2);
                }
                case "-" -> {
                    currResult = String.valueOf(numb1 - numb2);
                }
                case "*" -> {
                    currResult = String.valueOf(numb1 * numb2);
                }
                default -> {
                    break;
                }
            }
            rounds.add(new SimpleEntry<>(currExpression, currResult));
        }

        Engine.getStart(taskText, rounds);
    }
}
