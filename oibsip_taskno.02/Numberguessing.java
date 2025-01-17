package number_guessing_game;

 

import java.util.Scanner;
import java.util.Random;

public class Numberguessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 10;

        System.out.println("Welcome to Guess the Number game!");
        System.out.println("I've selected a random number between " + lowerBound + " and " + upperBound + ". Guess it!");

        int attempts = 0;
        int score = 100; // Initial score

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number!");
                System.out.println("Your score: " + score);
                break;
            } else if (guess < randomNumber) {
                System.out.println("Low! Try again.");
            } else {
                System.out.println("High! Try again.");
            }

            score -= 10;
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you have used all your attempts.");
            System.out.println("The number was: " + randomNumber);
        }

        scanner.close();
    }
}
