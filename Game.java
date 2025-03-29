// Author: Chesna Ann Eisan
// Date: March 2025
// Description: Game class to handle game logic, user input, and score calculation

import java.util.Scanner;

public class Game {
    private Player player1;          // First player
    private Player player2;          // Second player
    private Scanner scanner;         // Scanner to read user input

    // Constructor to initialize the game with two players
    public Game(Player p1, Player p2)  {
        this.player1 = p1;
        this.player2 = p2;
        this.scanner = new Scanner(System.in);
    }

    // Method to start the game and loop through 10 frames
    public void play() throws ScoreException {
        for (int frameNumber = 1; frameNumber <= 10; frameNumber++) {
            System.out.println("\nFrame " + frameNumber);
            playFrame(player1, frameNumber);  // Player 1 plays
            playFrame(player2, frameNumber);  // Player 2 plays
        }
    }

    // Method to handle individual player’s turn in a frame
    private void playFrame(Player player, int frameNumber) throws ScoreException {
        System.out.println("\n" + player.getName() + "'s turn:");

        int firstRoll = getRollInput("Enter first roll: ");
        int secondRoll = 0;

        // If not a strike, ask for the second roll
        if (firstRoll < 10) {
            secondRoll = getRollInput("Enter second roll: ");
            // Validate that total pins in a frame do not exceed 10
            if (firstRoll + secondRoll > 10) throw new ScoreException("Invalid! Total pins exceed 10");
        }

        int extraRoll = 0;
        // Special rule for the 10th frame: Bonus roll if strike or spare
        if (frameNumber == 10 && (firstRoll == 10 || (firstRoll + secondRoll) == 10)) {
            extraRoll = getRollInput("Bonus Roll for Frame 10: ");
        }

        // Add the frame to the player's record
        Frame frame = new Frame(firstRoll, secondRoll, extraRoll);
        player.addFrame(frame);
    }

    // Helper method to safely get roll input and validate the pin count
    private int getRollInput(String message) throws ScoreException {
        System.out.print(message);
        int pins = scanner.nextInt();
        if (pins < 0 || pins > 10) throw new ScoreException("Pins must be between 0 and 10");
        return pins;
    }

    // Method to print the final scores with UI enhancement (framed with ######)
    public void printScores() {
        System.out.println("\n########################################");
        System.out.println("####         Final Scores            ####");
        System.out.println("########################################");
        System.out.println("####  " + player1.getName() + ": " + player1.calculateTotalScore() + "                      ####");
        System.out.println("####  " + player2.getName() + ": " + player2.calculateTotalScore() + "                      ####");
        System.out.println("########################################");
    }
}
