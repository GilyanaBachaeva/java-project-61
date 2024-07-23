package hexlet.code;
import java.util.Random;

public class Prime {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void gamePrime() {
        String taskText = "Answer 'yes' if given number is prime. Otherwise answer 'no'";

        String[] result = new String[3];
        String[] expression = new String[3];

        for (int i = 0; i < 3; ++i) {
            expression[i] = String.valueOf(new Random().nextInt(100) + 1);
            int theNumber;
            theNumber = Integer.parseInt(expression[i]);
            if (isPrime(theNumber)) {
                result[i] = "yes";
            } else {
                result[i] = "no";
            }
        }
        Engine.getStart(taskText, result, expression);
    }
}
