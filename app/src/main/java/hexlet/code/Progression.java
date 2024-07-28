package hexlet.code;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Progression {
    public static void findProgression() {
        String taskText = "What number is missing in the progression?";

        List<SimpleEntry<String, String>> rounds = new ArrayList<>();

        for (int i = 0; i < 3; ++i) {
            int step = new Random().nextInt(8) + 1;
            int start = new Random().nextInt(9) + 1;
            String currExpression = "";
            int[] temp = new int[10];

            int hideNumb = new Random().nextInt(9);

            for (int j = 0; j < 10; ++j, start += step) {
                temp[j] = start;

            }

            for (int j = 0; j < 10; ++j) {
                if (j != hideNumb) {
                    currExpression += String.valueOf(temp[j]) + ' ';
                } else {
                    currExpression += ".. ";
                }
            }
            rounds.add(new SimpleEntry<>(currExpression, String.valueOf(temp[hideNumb])));
        }
        Engine.getStart(taskText, rounds);
    }
}
