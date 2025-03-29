// Author: Chesna Ann Eisan
// Date: March 2025
// Description: Player class to store player data, frames, and calculate total score.

import java.util.ArrayList;

public class Player {
    private String name;                    // Player's name
    private ArrayList<Frame> frames;        // List to store each frame played by the player

    // Constructor to initialize player name and frame list
    public Player(String name) {
        this.name = name;
        this.frames = new ArrayList<>();
    }

    // Getter for player's name
    public String getName() {
        return name;
    }

    // Getter for player's frames
    public ArrayList<Frame> getFrames() {
        return frames;
    }

    // Method to add a frame to the player's frame list
    public void addFrame(Frame frame) {
        frames.add(frame);
    }

    /**
     * Method to calculate the total score of the player considering
     * the rules for strikes and spares.
     * Strike bonus: Add next two rolls
     * Spare bonus: Add next one roll
     */
    public int calculateTotalScore() {
        int score = 0;

        // Iterate through each frame to compute the score
        for (int i = 0; i < frames.size(); i++) {
            Frame frame = frames.get(i);
            score += frame.getScore(); // Add current frame's basic score

            // If strike, add next two rolls as bonus
            if (frame.isStrike() && i + 1 < frames.size()) {
                score += frames.get(i + 1).getFirstRoll();

                // If next frame is also a strike, get one more roll from the following frame
                if (frames.get(i + 1).isStrike() && i + 2 < frames.size()) {
                    score += frames.get(i + 2).getFirstRoll();
                } else {
                    score += frames.get(i + 1).getSecondRoll();
                }
            }
            // If spare, add the first roll of the next frame as bonus
            else if (frame.isSpare() && i + 1 < frames.size()) {
                score += frames.get(i + 1).getFirstRoll();
            }
        }

        return score;
    }
}
