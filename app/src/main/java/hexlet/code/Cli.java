package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName);
    }
}
