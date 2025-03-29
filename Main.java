// Author: Chesna Ann Eisan
// Date: March 2025
// Description: Main class to run the Bowling Game

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("########################################");
        System.out.println("####    Welcome to Bowling Game!    ####");
        System.out.println("########################################\n");
        System.out.print("Enter Player 1 Name: ");
        Player player1 = new Player(sc.nextLine());

        System.out.print("Enter Player 2 Name: ");
        Player player2 = new Player(sc.nextLine());



        Game game = new Game(player1, player2);

        try {
            game.play();
            game.printScores();
        } catch (ScoreException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
