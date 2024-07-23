package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static void getStart(String taskText, String[] result, String[] expression) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!\n" +
                "May I have your name?");

        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!\n");

        System.out.println(taskText);

        int wrongAnswer = 0;
        for (var i = 0; i < 3; i++) {
            System.out.println(expression[i] + "\nYour answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(result[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + result[i]);
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
