//Name: Chesna Ann Eisan
//Date: Jan 24,2025
// Description: Oop1- In class
// Unit Convertor Application


//we should first do the importing for the storing the input from the user
import java.util.*;
// there is class to be defined , here it is UnitConvertor and its public class
// There is also the main method were code is stored for runing the program.
public class UnitConvertor {
    //for user input
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // for printing out the application name

        System.out.println("Unit Convertor Application");
        // to specify the data type for user input
        String userInput;
        // declaring the variables which can change during run of program
        double f;
        double cel;
        // Asking the user to enter the temp value in farenheit
        System.out.println("Enter the value of temperature in farenheit:");
        // next line is for getting the inout from user
        userInput=input.nextLine();

        // it is for converting the string input to double which is basically decimals
        f=Double.parseDouble(userInput);
        // conversion formula
        cel=(f-32)*5/9;
        System.out.println(cel+"degree celcius");

        //For converting the distance that in metres to kilometers
        System.out.println("Enter the distance traveled in metres ");
        double meters;
        double km;
        meters=input.nextDouble();
        km= meters / 1000;
        System.out.println(km+"kilometers");


        // Conversion of weight from grams to kilograms
        System.out.println("Enter the weight in grams");
        double grams;
        double kilograms;
        grams=input.nextDouble();
        kilograms=grams/1000;
        System.out.println(kilograms+"kilograms");





    }

}

