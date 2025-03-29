// Author: Chesna Ann Eisan
// Date: March 2025
// Description: Frame class to store two rolls and an extra roll (used in the 10th frame if needed)

public class Frame {
    private int firstRoll;   // Number of pins knocked down in the first roll
    private int secondRoll;  // Number of pins knocked down in the second roll
    private int extraRoll;   // Extra roll used in the 10th frame if the player gets a strike or spare

    // Constructor for normal frames (without extra roll)
    public Frame(int firstRoll, int secondRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.extraRoll = 0; // Default extra roll is zero unless specified
    }

    // Constructor for frame
    public Frame(int firstRoll, int secondRoll, int extraRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.extraRoll = extraRoll;
    }

    // Getter for first roll
    public int getFirstRoll() {
        return firstRoll;
    }

    // Getter for second roll
    public int getSecondRoll() {
        return secondRoll;
    }

    // Method to check if the frame is a strike (all 10 pins knocked down in the first roll)
    public boolean isStrike() {
        return firstRoll == 10;
    }

    // Method to check if the frame is a spare (all 10 pins knocked down in two rolls)
    public boolean isSpare() {
        return !isStrike() && (firstRoll + secondRoll == 10);
    }

    // Calculate the score for this frame including any extra roll (if applicable)
    public int getScore() {
        return firstRoll + secondRoll + extraRoll;
    }
}
