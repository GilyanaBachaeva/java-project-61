package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "4 - GCD\n" +
                "5 - Progression\n" +
                "6 - Prime\n" +
                "0 - Exit");
        String userAnswer = scanner.next();
        System.out.println("Your choice: " + userAnswer);
        if (userAnswer.equals("1")) {
            System.out.println("Welcome to the Brain Games!\n" +
                    "May I have your name?");
            String userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
            return;
        } else if (userAnswer.equals("0"))  {
            System.out.println("Executing exit, goodbye!");
            return;
        } else if (userAnswer.equals("2"))  {
            Even.evenGame();
            return;
        } else if (userAnswer.equals("3")) {
            Calculator.makeCalculator();
            return;
        } else if (userAnswer.equals("4")) {
            GCD.findGCD();
            return;
        } else if (userAnswer.equals("5")) {
            Progression.findProgression();
            return;
        } else if (userAnswer.equals("6")) {
            Prime.gamePrime();
            return;
        }
        System.out.println(userAnswer + " is incorrect enter, please try again");
        scanner.close();
    }
}
