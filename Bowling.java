//Name: Chesna Ann Eisan
//Date: March 7th, 2025
//Description: This is an application for creating a
// scoring system application for the bowling game.

// Name: Chesna Ann Eisan
// Date: March 7th, 2025
// Description: This is an application for creating a
// scoring system application for the bowling game.
// this is for defining the package
package subject;
// This is for importing the scanner class for taking the users input
import java.util.Scanner;

// this is for defining the public class named Bowling
public class Bowling {
    // it is the scanner for getting the user input
    private static Scanner input = new Scanner(System.in);

    /// ////creating functionssss
    // creating the first functtion named get Roll() which is named in camelCase. for basically getting the users
    // roll score
    //first the program must be starting by asking for the players name
    // and users input for the name is stored as a string
    static int getRoll() {
        System.out.println("Please enter the player's name:");
        String playersname = input.next();
        // then the user is asked for the roll score and it must be a value between 1 and 10
        System.out.println("Please enter the player's roll score (0-10):");
        int rollscore = input.nextInt();

        // and if condition is used for the validation of the roll score
        // and otherwise error message should be shown
        if (rollscore >= 0 && rollscore <= 10) {
            return rollscore;
        } else {
            System.out.println("The input is not valid. Please enter a number between 0 and 10.");
            return getRoll(); // the function is called again that is called recursion
        }

    }

//creating the second function called getTurnScores()
public static int getTurnScores() {
    int firstrollscore = getRoll();
    if (firstrollscore == 10) {
        return 10;
    } else {
        int secondrollscore = getRoll();
        return firstrollscore + secondrollscore;
    }
}}
/*  */
////creating a function for getGameScores()
//    static int getGameScores() {
//        int totalscore = 0;
//        System.out.println("score for " + playerName);
//        totalScore += getTurnScores();
//
//    }


// this is for calling the function //this is basically the starting that is the main fn
//    public static void main(String[] args) {
//        int roll = getRoll(); // calling the get roll function here
//        System.out.println("The score for a single roll is : " + roll);
//        int frameScore = getTurnScores();
//        System.out.println("Total score for this turn: " + frameScore);
//    }

