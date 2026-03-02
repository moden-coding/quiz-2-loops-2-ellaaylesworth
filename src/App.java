import java.util.*;

/*
 * Given:
 * A random number between 1 and 20 is given in the variable secretNumber
 * 
 * Task begins:
 * 1. Continually take input from the user until they guess the correct number.
 * STOP HERE FOR A B
 * 
 * 2. Modify #2 so that it only accepts values between 1 and 20 (inclusive).
 *    If the number is too high or low, give a message telling the user to
 *    enter a valid number. Do not evaluate their guess. 
 * STOP HERE FOR A B+
 * 
 * 3. Modify your code so that it keeps track of the number of guesses. When
 *    the correct number is guessed, report out the number of tries.
 * STOP HERE FOR AN A-
 * 
 * 4. Give the player feedback about their guess:
 *    - If the guess is higher than the secret, say "Lower"
 *    - If the guess is lower than the secret, say "Higher"
 *    - After 4 wrong valid guesses, give ONE hint about even/odd:
 *     "Hint: the secret number is even." OR "Hint: the secret number is odd."
 * STOP HERE FOR AN A+
 * 
 */

// SAMPLE USAGE: B
/**
 * The secret number is 14. Shh! Don't tell anyone
 * Guess a number:
 * 7
 * Guess a number:
 * 14
 */

// SAMPLE USAGE: B+
/**
 * The secret number is 1. Shh! Don't tell anyone
 * Guess a number:
 * 0
 * Pick a number from 1 to 20!
 * Guess a number:
 * 21
 * Pick a number from 1 to 20!
 * Guess a number:
 * 1
 */

// SAMPLE USAGE: A-
/**
 * The secret number is 18. Shh! Don't tell anyone
 * Guess a number:
 * 10
 * Guess a number:
 * 18
 * It took you 2 guesses.
 */

// SAMPLE USAGE: A+
/**
 * The secret number is 5. Shh! Don't tell anyone
 * Guess a number:
 * 12
 * Lower
 * Guess a number:
 * 8
 * Lower
 * Guess a number:
 * 4
 * Higher
 * Guess a number:
 * 6
 * Higher
 * The number is odd.
 * Guess a number:
 * 5
 * It took you 5 guesses.
 */

public class App {
    public static void main(String[] args) throws Exception {
        // DO NOT TOUCH THE THREE LINES BELOW
        Scanner scanner = new Scanner(System.in);
        int secretNumber = getSecretNumber();
        int count = 0;
        System.out.println("The secret number is " + secretNumber + " Shh! Don't tell anyone");
        while (true) {
            System.out.println("Guess a number:");
            int user = scanner.nextInt();
            int remainder = secretNumber % 2;
            count++;
            if (user == secretNumber) {
                break;
            }
            if (user < 1) {
                System.out.println("INVALID");
            }
            if (user > 20) {
                System.out.println("INVALID");
            }
            if (user < secretNumber) {
                System.out.println("higher");
            }
            if (user > secretNumber) {
                System.out.println("lower");
            }
            if (remainder == 0) {

                System.out.println("Hint: the secret number is even.");

            } else {
                System.out.println("Hint: the secret number is odd.");
                secretNumber = secretNumber;

            }
           
        }  System.out.println("it took you " + count + " tries");
    }

    // Do not modify!!!
    public static int getSecretNumber() {
        Random random = new Random();
        return random.nextInt(20) + 1; // 1–20 inclusive
    }
}