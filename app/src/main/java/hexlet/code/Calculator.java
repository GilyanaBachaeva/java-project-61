package hexlet.code;
import java.util.Random;

public class Calculator {
    private static String result;

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static void makeCalculator() {
        String taskText = "What is the result of the expression?";
        String[] operate = new String[]{"+", "-", "*"};

        String[] result = new String[3];
        String[] expression = new String[3];

        for (int i = 0; i < 3; ++i) {
            int numbExp = (int) (Math.random() * 3);  // случайный выбор операнда
            int numb1 = new Random().nextInt(100) + 1;
            int numb2 = new Random().nextInt(100) + 1;

            String curr_expression = numb1 + " " + operate[numbExp] + " " + numb2;

            String curr_result = "";
            switch (operate[numbExp]) {
                case "+" -> {
                    curr_result = String.valueOf(Calculator.add(numb1, numb2));
                }
                case "-" -> {
                    curr_result = String.valueOf(Calculator.minus(numb1, numb2));
                }
                case "*" -> {
                    curr_result = String.valueOf(Calculator.multiply(numb1, numb2));
                }
            }
            expression[i] = curr_expression;
            result[i] = curr_result;
        }

        Engine.getStart(taskText, result, expression);
    }
}
