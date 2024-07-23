package hexlet.code;
import java.util.Random;

public class Progression {
    public static void findProgression() {
        String taskText = "What number is missing in the progression?";

        String[] result = new String[3];
        String[] expression = new String[3];

        for (int i = 0; i < 3; ++i) {
            int step = new Random().nextInt(8) + 1;
            int start = new Random().nextInt(9) + 1;
            String curr_expression = "";
            int[] temp = new int[10];

            int hideNumb = new Random().nextInt(9);

            for (int j = 0; j < 10; ++j, start += step) {
                temp[j] = start;
            }

            for (int j = 0; j < 10; ++j) {
                if (j != hideNumb) {
                    curr_expression += String.valueOf(temp[j]) + ' ';
                } else {
                    curr_expression += ".. ";
                }
            }
            result[i] = String.valueOf(temp[hideNumb]);
            expression[i] = curr_expression;
        }
        Engine.getStart(taskText, result, expression);
    }
}
