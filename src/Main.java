import java.util.Scanner;
import java.util.Random;

public class Main {
    // Creates function evaluate which takes argument guessedNumber and randomNumber
    // When While-loop breaks the amount of guesses is returned
    static int evaluate(int guessedNumber, int randomNumber){
        Scanner scanner = new Scanner(System.in);
        // User will always guess at least once
        int amountOfGuesses = 1;
        // As long as guessedNumber is wrong, let the user know if they guess too high or low and ask for a new number
        while (guessedNumber != randomNumber) {
            if (guessedNumber > randomNumber) {
                System.out.println("Too high, try again:");
            } else {
                System.out.println("Too low, try again:");
            }
            amountOfGuesses++;
            guessedNumber = scanner.nextInt();
        }

        // When user has guessed correct, return amount of guesses
        return amountOfGuesses;
    }

    public static void main(String[] args) {
        // Creates both Scanner and Random object
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        // Generates a random number between 1-100
        final int MIN = 1;
        final int MAX = 100;

        while (true) {
            // Creates a random number between MIN(1) and MAX(100)
            int randomNumber = rand.nextInt(MIN, MAX);

            // Takes input from user and saves in variable guessedNumber
            System.out.println("Guess the random number: ");
            int guessedNumber = scanner.nextInt();

            // amountOfGuesses uses function evaluate and gets assigned the returned value (the amount of times user
            // has guessed)
            int amountOfGuesses = evaluate(guessedNumber, randomNumber);
            System.out.println("You guessed right, congrats! You needed " + amountOfGuesses + " guesses. Let's play " +
                    "again!\n");
        }
    }
}