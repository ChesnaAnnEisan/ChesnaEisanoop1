//Name: Chesna Ann Eisan
//Date : feb 16th,2025
 // Program Name: Temperature Analyzing system
// Description of the program
//this program is basically about analusing the temperature data.
//The program is to be started asking the user for the data input
// The user is asked how many days to analyze the data for the
// ans must be in range 2 and 366


// This is for importing scanner class to get the user input data
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// we are here defining a class named temperature analyzer
public class TemperatureAnalyzer {
    public static void main(String[]args) {
        // for creating a scanner object for input
        Scanner input = new Scanner(System.in);
        // for printing the program name
        System.out.println("Temperature Analyzing System");
        // for asking the user input
        System.out.println(" How many days do want to analyze the temperature data for(2-366):");

        // this is for reading the user input
        int days= input.nextInt();

        // Next is defining arrays for storing low and high temperature for each day
        // defining array for low temperature
        double[] lowtemperature = new double[days];
        // defining array for high temperature
        double[] hightemperature = new double[days];

        // creating a for loop for temperature input for each day
        for (int i=0;i <days; i++) {
            System.out.println("\nDay"+ (i + 1));

            // For asking the user for low temp data and storing it in the array
            System.out.println("Please enter the low temperature value(-100 to 100):");

            // for storing hte value at index i
            lowtemperature[i] = input.nextDouble();


            // for asking the user for high temperature data and storing it in the array
            System.out.println("Please enter the high temperature (-100 to 100,it should be higher than the low temperature): ");
            hightemperature[i]= input.nextDouble();// for storing the value at index i

        }

        // after the user enter the low and high temp values, the program should calculate and display the average temp for each of the day and also an overall average
        // then it should also display the day with lowest temp and highest temp
        // first we need to initialize the varibale for average , highest and lowest temperatures
        double average=0;
        double highesttemperature = hightemperature[0];
        double lowesttemperature = lowtemperature[0];
        int highestday =1;
        int lowestday =1;


        // creating a loop for processing and analyzing temp data
        for (int i = 0; i < days; i++) { // this helps iterates through the array
            // for calculating daily average temperature
            double dailytemperatureaverage = (lowtemperature[i] + hightemperature[i]) / 2;

            // for printing the temperatures and average for each day
            System.out.println("day " +(i+1)+ " low temperature:"+lowtemperature[i]+ ", high temperature" +hightemperature[i]+ ", average temperature" +dailytemperatureaverage);


            // for adding average to the overall average we use this
            average += dailytemperatureaverage;


            // for updating the result of the highest temp day
            if (hightemperature[1]>highesttemperature)
            {
                highesttemperature=hightemperature[i];
                highestday=i+1;
            }

            // for updating the lowest temp value
            if (lowtemperature[i] < lowesttemperature){
                lowesttemperature = lowtemperature[i];
                lowestday = i +1;
            }
            // for calculating and displaying the values
            double finaltemperatureaverage= average/days;
            System.out.println("\nOverall average temperature:" + finaltemperatureaverage);


            // also for printing the highest and lowest temperature values
            System.out.println("Highest temperature recorded:" +highesttemperature + "on day" + highestday);
            System.out.println("Lowest temperature recorded:" + lowesttemperature+"on day" +lowestday);
        }
    }
    };


