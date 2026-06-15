import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // --- Generate computer choice using Math.random() ---
        // Math.random() returns [0.0, 1.0), so * 3 + 1 yields 1, 2, or 3
        int computerChoice = (int)(Math.random() * 3) + 1;

        // --- Display header and prompt user ---
        System.out.println("==========================================");
        System.out.println("          ROCK - PAPER - SCISSORS         ");
        System.out.println("==========================================");
        System.out.println("  1 = Rock  |  2 = Paper  |  3 = Scissors");
        System.out.println("------------------------------------------");
        System.out.print("  Enter your choice: ");
        int userChoice = input.nextInt();

        // --- Validate input ---
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("\n  Invalid input. Please enter 1, 2, or 3.");
            input.close();
            return;
        }

        // --- Convert integer to readable String using switch ---
        String userChoiceName;
        switch (userChoice) {
            case 1:  userChoiceName = "Rock";     break;
            case 2:  userChoiceName = "Paper";    break;
            case 3:  userChoiceName = "Scissors"; break;
            default: userChoiceName = "Unknown";
        }

        String computerChoiceName;
        switch (computerChoice) {
            case 1:  computerChoiceName = "Rock";     break;
            case 2:  computerChoiceName = "Paper";    break;
            case 3:  computerChoiceName = "Scissors"; break;
            default: computerChoiceName = "Unknown";
        }

        // --- Display both selections ---
        System.out.println("\n  Your choice:       " + userChoiceName);
        System.out.println("  Computer's choice: " + computerChoiceName);
        System.out.println("------------------------------------------");

        // --- Determine result using boolean variables ---
        boolean isTie     = (userChoice == computerChoice);
        boolean isUserWin = (userChoice == 1 && computerChoice == 3)   // Rock beats Scissors
                         || (userChoice == 2 && computerChoice == 1)   // Paper beats Rock
                         || (userChoice == 3 && computerChoice == 2);  // Scissors beats Paper

        // --- Display result using if-else ---
        String result;
        if (isTie) {
            result = "It's a tie!";
        } else if (isUserWin) {
            result = "You win!";
        } else {
            result = "Computer wins!";
        }

        System.out.println("  Result:            " + result);
        System.out.println("==========================================");

        input.close();
    }
}
