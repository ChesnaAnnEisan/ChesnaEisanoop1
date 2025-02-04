//package subject;
//import java.util.Scanner;
//
//public class Weekfour {
//    private static Scanner input = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        System.out.println("Please enter the age: ");
//        int age = input.nextInt();
//
//        if (age < 25)
//        {
//            if (age > 18) {
//                System.out.println("You are eligible for vote");
//            } else if (age == 18) {
//                System.out.println("You are right for vote");
//            } else {
//                System.out.println("You are not fit for voting");
//            }
//
//        }
//        else {
//            System.out.println("You are overage");
//        }
//
//    }
//}






//package subject;
//import java.util.Scanner;
//
//public class Weekfour {
//    private static Scanner input = new Scanner(System.in);
//
//    public static void main(String[] args){
//        System.out.println("Please enter the first value:");
//        int n1= input.nextInt();
//        System.out.println("Please enter the second value");
//        int n2=input.nextInt();
//        if(n1>n2)
//        {
//            System.out.println("first value is greater than the second value");
//
//        }
//        else if(n1==n2)
//        {
//            System.out.println("both are equal");
//        }
//        else{
//            System.out.println("second value is more than the first value");
//        }
//
//    }
//}


//
//package subject;
//import java.util.Scanner;
//
//public class Weekfour {
//    private static Scanner input = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        System.out.println("Please enter the first value:");
//        int n1= input.nextInt();
//        String strrg = (n1 > 0) ? "Positive" : "Negative";
//        System.out.println(strrg);
//    }
//}






package subject;
import java.util.Scanner;

public class Weekfour {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the first value:");
        int n1= input.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}