import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            Random random = new Random();

            int userScore = 0;
            int systemScore = 0;
            int match = 1;

            System.out.println("Rock Paper Scissors - 5 Match Series");

            while (match <= 5) {

                System.out.println("\nMatch " + match);
                System.out.println("Enter your choice:");
                System.out.println("1. Rock");
                System.out.println("2. Paper");
                System.out.println("3. Scissors");

                int userChoice;

                // Input validation
                while (true) {
                    System.out.print("Your choice: ");
                    userChoice = input.nextInt();

                    if (userChoice >= 1 && userChoice <= 3) {
                        break; // valid input
                    } else {
                        System.out.println("Invalid input! Please enter 1, 2, or 3.");
                    }
                }

                int systemChoice = random.nextInt(3) + 1;

                // Show system choice in words
                String[] choices = {"Rock", "Paper", "Scissors"};
                System.out.println("System chose: " + choices[systemChoice - 1]);

                if (userChoice == systemChoice) {
                    System.out.println("It's a Draw!");
                }
                else if ((userChoice == 1 && systemChoice == 3) ||
                        (userChoice == 2 && systemChoice == 1) ||
                        (userChoice == 3 && systemChoice == 2)) {

                    System.out.println("You Win this match!");
                    userScore++;
                }
                else {
                    System.out.println("System Wins this match!");
                    systemScore++;
                }

                match++;
            }

            System.out.println("\nFinal Result:");
            System.out.println("Your Score: " + userScore);
            System.out.println("System Score: " + systemScore);

            if (userScore > systemScore) {
                System.out.println("Congratulations! You won the series.");
            }
            else if (systemScore > userScore) {
                System.out.println("System won the series.");
            }
            else {
                System.out.println("Series Draw!");
            }

            input.close();
        }
    }


