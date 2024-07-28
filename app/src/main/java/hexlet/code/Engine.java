package hexlet.code;
import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Scanner;

public class Engine {
    public static void getStart(String taskText, List<SimpleEntry<String, String>> rounds) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");

        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(taskText);

        int wrongAnswer = 0;
        for (SimpleEntry<String, String> round: rounds) {
            System.out.println(round.getKey() + "\nYour answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(round.getValue())) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + round.getValue());
                wrongAnswer++;
            }
        }

        if (wrongAnswer > 0) {
            System.out.println("Let's try again, " + userName);
        } else {
            System.out.println("Congratulations, " + userName + "!");
        }

        scanner.close();
    }
}
