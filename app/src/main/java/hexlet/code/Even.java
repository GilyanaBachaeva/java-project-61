package hexlet.code;
import java.util.Random;

public class Even {
    public static void evenGame() {
        String taskText = "Answer 'yes' if the number is even, otherwise answer 'no'";

        String[] result = new String[3];
        String[] expression = new String[3];

        for (int i = 0; i < 3; ++i) {
            expression[i] = String.valueOf(new Random().nextInt(100) + 1);
            int theNumber;
            theNumber = Integer.parseInt(expression[i]);
            if (theNumber % 2 == 0) {
                result[i] = "yes";
            } else {
                result[i] = "no";
            }
        }
        Engine.getStart(taskText, result, expression);
    }
}
