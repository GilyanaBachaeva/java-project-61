package hexlet.code;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Even {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void evenGame() {
        String taskText = "Answer 'yes' if the number is even, otherwise answer 'no'";

        List<SimpleEntry<String, String>> rounds = new ArrayList<>();
        String currExpression = "";
        String currResult = "";

        for (int i = 0; i < 3; ++i) {
            currExpression = String.valueOf(new Random().nextInt(100) + 1);
            int theNumber;
            theNumber = Integer.parseInt(currExpression);
            if (isEven(theNumber)) {
                currResult = "yes";
            } else {
                currResult = "no";
            }
            rounds.add(new SimpleEntry<>(currExpression, currResult));
        }
        Engine.getStart(taskText, rounds);
    }
}
