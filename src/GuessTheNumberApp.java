import java.util.Random;
import java.util.Scanner;

class Game {
    private int randomNumber;
    private int userInput;
    private int noOfGuesses;

    // Constructor
    Game() {
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1;
        noOfGuesses = 0;
    }

    // Getter for number of guesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter for number of guesses
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // Getter for user input
    public int getUserInput() {
        return userInput;
    }

    // Setter for user input
    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    // Take input
    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess (1-100): ");
        userInput = sc.nextInt();
        noOfGuesses++;
    }

    // Check number
    public boolean isCorrectNumber() {
        if (userInput == randomNumber) {
            System.out.println("🎉 Correct! You guessed it in " + noOfGuesses + " attempts.");
            return true;
        } else if (userInput < randomNumber) {
            System.out.println("Too low! Try again.");
        } else {
            System.out.println("Too high! Try again.");
        }
        return false;
    }
}

public class GuessTheNumberApp {
    public static void main(String[] args) {
        Game game = new Game();
        boolean correct = false;

        while (!correct) {
            game.takeUserInput();
            correct = game.isCorrectNumber();
        }
    }
}