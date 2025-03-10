// Name: Chesna Ann Eisan
// Date: March 7th, 2025
// Description: This is an application for creating a
// scoring system for a bowling game.
//About the game logic
//The players are given two chances for rolling the ball and knocking the pins.
// total 10 pins are there and the number of pins knocked is the point you score
// if the players knocks all 10 pins in the first try that is called a strike .
// and if players knocks all 10 pins in two tries thats called a spare
// There is a total of ten frames
// if not all 10 pins are knocked down in two tries , then the score is the number of pins knocked down that is from 0 to 9
//this is for defining the package
package subject;
// this is for importing the scanner class for taking the users input
import java.util.Scanner;

// Defining a public class named BowlingGame
// Basically the logic of the game is in this class
public class BowlingGame {
    // Creating a Scanner object to take user input
    private static Scanner input = new Scanner(System.in);
/// /////first function
///
///
///
///
    // Function to get a valid roll score and their name from the user
    //it ensures if the user has entered the valid data and returns the value
    //if the user enters the incorrect input the functions is called again it is called recursion.

    static int getRoll() {
        // Asking the player to enter their name
        System.out.println("Please enter the player's name:");
        String playerName = input.next(); // Storing player's name

        // Asking for the roll score and ensuring it is between 0 and 10
        System.out.println(playerName + ", please enter your roll score (0-10):");
        int rollScore = input.nextInt(); // Storing player's roll score

        // Checking if the entered score is valid
        if (rollScore >= 0 && rollScore <= 10) {
            return rollScore; // Returning the valid roll score
        } else {
            // Displaying an error message if the input is invalid
            System.out.println("Invalid input. Please enter a number between 0 and 10.");
            return getRoll(); // Calling the function again (recursion) for a valid input
        }
    }


    /// ///second fucntion
    ///
    ///
    ///
    // Function to get the roll score for players turn (frame)
    //if the player gets a strike that is a 10 point on their first roll they dont get a second chance
    //if they dont get a strike they roll for the second time and frame score is sum of both the roll scores
     //if total point point exceed 10 , function is called again
    // the total score is returned
    static int getTurnScores() {
        // Getting the first roll score by calling the getroll function
        int firstRoll = getRoll();

        // Checking if the player scored a strike (10 pins in the first roll)
        if (firstRoll == 10) {
            System.out.println("That is a strike!");
            return 10; // Returning 10, as no second roll is needed
        } else {
            // Getting the second roll score
            int secondRoll = getRoll();

            // Ensuring that the total pins knocked down in a frame is not greater than 10
            // if the sum of two rolls is more than 10 error message is displayed
            if (firstRoll + secondRoll > 10) {
                System.out.println("The score is not valid. The total pins knocked down in a frame cannot be more than 10.");
                return getTurnScores(); // Calling the function again to get valid inputs
            }
            return firstRoll + secondRoll; // Returning the sum of both rolls
        }
    }

    /// /third function/////////
    ///
    ///
    // Function to play the game for one player and return their final score
    static int getGameScores(String playerName) {
        int totalscore = 0; // Variable to store the total score

        System.out.println("\nStarting the game for " + playerName); // Displaying player's name

        // Looping through 10 frames since a bowling game has 10 frames
        for (int frame = 1; frame <= 10; frame++) {
            System.out.println("Frame " + frame); // Displaying the current frame number that is there are a total of 10 frames
            totalscore += getTurnScores(); //this is for adding the score of the current frame to the total score
            System.out.println(playerName + "'s score after frame " + frame + ": " + totalscore); // Displaying score for the players after each frame
        }
        return totalscore; // Returning the final score after 10 frames
    }

    //this is the Main function to run the game
    public static void main(String[] args) {
        // Asking for player1 and player 2 their  names
        System.out.print("Enter Player 1's name: ");
        //for storing the ifrst players name
        String player1 = input.next();

        System.out.print("Enter Player 2's name: ");
        //for storing the second players name
        String player2 = input.next();

        // for getting the final scores for both players//we are calling the function getGameScoes here.
        int player1Score = getGameScores(player1);
        int player2Score = getGameScores(player2);

        // this is for displaying the final scores of both the players
        System.out.println("Final Scores:");
        System.out.println(player1 + ": " + player1Score);
        System.out.println(player2 + ": " + player2Score);

        // An if else conditions are used here for comparing both the players and displaying the winner
        if (player1Score > player2Score) {
            System.out.println(player1 + " wins!");
        } else if (player2Score > player1Score) {
            System.out.println(player2 + " wins!");
        } else {
            System.out.println("It is a tie !");
        }

    }
}
