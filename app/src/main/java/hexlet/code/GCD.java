package hexlet.code;
import java.util.Random;

public class GCD {
    public static int gcdByBruteForce(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void findGCD() {
        String taskText = "Find the greatest common divisor of given numbers";

        String[] result = new String[3];
        String[] expression = new String[3];

        for (int i = 0; i < 3; ++i) {
            int numb1 = new Random().nextInt(100) + 1;
            int numb2 = new Random().nextInt(100) + 1;

            String curr_expression = "Question: " + numb1 + " " + numb2;
            String curr_result = String.valueOf(gcdByBruteForce(numb1, numb2));

            expression[i] = curr_expression;
            result[i] = curr_result;
        }
        Engine.getStart(taskText, result, expression);
    }
}
