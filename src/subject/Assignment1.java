//Name: Chesna Ann Eisan
//Date: Feb 1,2025
//Description: Assignment-1 Body Mass Index
//This application is for calculating bmi of a person.
//In this application, ask user for accepting numeric height in inches in the range of 24 -120.
//also ask user for weight in pounds with a min value of 25 pounds.
// if user enters wrong input , show an error message. then ask again for the right input.
// after calculating bmi, category must be displayed. The categories include underweight,
// healthy, overweight,etc.
// First is declaring the packages here it is named subject
package subject;
// We are here importing a scanner class for taking the users input
import java.util.Scanner;


// We are here defining a class named assignment1 and class contains a main method which contains the code where it runs by default.
public class Assignment1 {
    // we are creating an instance of the scanner class named input here
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //declaring variables
        double height;
        double weight;


         // asking the user for user input
         System.out.println("Please enter your height in inches(24-120):");
         // for assigning value from user to the variable in data type double is used.
        height = input.nextDouble();

        // asking user for the weight input
        System.out.println("Please enter your weight in pounds");
        // for assigning value from user to variable in double data type
        weight = input.nextDouble();
        //we are here using a math class which already exists in java where there is actually no need for importing
        // we use the pow() method which is used to return number raised to a exponent

        double bmi = (weight / Math.pow(height, 2)) * 703;

        //we are here using a if else condition in a nested if format according to the program requirements,
        // that is the weight in pounds must be atleast of 25 and height range is 24-120
        if (weight<25)
        {
            System.out.println("Please enter right input with a minimum of 25 pounds.");
        }
        else if (height > 120 ) {
            System.out.println("Please enter the right input in the range (24-120)");
        }
        else if (height < 24) {
            System.out.println("Please enter the right input in the range(24-120)");

        } else {
            // for printing out the result
            System.out.println("The bmi of the person is: "+bmi);
        }

        // For printing out the category according to the bmi value
        // A varibale named string is declred for storing the value
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            category = "Healthy Weight";
        } else if (bmi >= 25 && bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        // for displaying the result and category altogether
        System.out.println("The bmi value is "+bmi +"&"+"\nThe category is "+category );





            }
}
