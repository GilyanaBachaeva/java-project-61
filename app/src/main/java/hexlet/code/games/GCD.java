package hexlet.code.games;

import hexlet.code.Engine;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static hexlet.code.Engine.NUMBQUESTIONS;

public class GCD {
    public static int generateGcd(int n1, int n2) {
        int answer = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                answer = i;
            }
        }
        return answer;
    }

    public static void findGCD() {
        String taskText = "Find the greatest common divisor of given numbers.";

        List<SimpleEntry<String, String>> rounds = new ArrayList<>();

        for (int i = 0; i < NUMBQUESTIONS; ++i) {
            int limit = 100;
            int numb1 = new Random().nextInt(limit) + 1;
            int numb2 = new Random().nextInt(limit) + 1;

            String currExpression = numb1 + " " + numb2;
            String currResult = String.valueOf(generateGcd(numb1, numb2));

            rounds.add(new SimpleEntry<>(currExpression, currResult));
        }
        Engine.getStart(taskText, rounds);
    }
}
