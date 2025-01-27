import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        //Scanner Class
        //used to read Java user input, uses "System.in"
        // to read the value of any datatype next"nextLine"
        //Scanner userInput = new Scanner(System.in);
        //System.out.println("Welcome, please input your date of birth");
        //short dob= userInput.nextShort();
        //short presentYear= 2021;
       // int customersAge= presentYear - dob;
        //System.out.println("You are "+ customersAge + "years old");

        //if (customersAge <18) {
        //    System.out.println("Too young to bet. Bye");
        //} else if (customersAge >18){
         //   System.out.println("Welcome, you are qualified");
        //}

        //Task 8
        //Build a Simple interest calculator.
        // Write a program to ask the user for the necessary field you need in calculating the simple interest
        // and then communicate the simple interest back to the user is a good sentence

        Scanner simpleInterest = new Scanner(System.in);
        System.out.println("Simple Interest Calculator");
        System.out.println("Enter the Principal amount (P): ");
        double principal= simpleInterest.nextDouble();

        System.out.println("Enter the annual rate (R) in percentage:");
        double rate = simpleInterest.nextDouble();

        System.out.println("Enter the time period (T) in years: ");
        double time = simpleInterest.nextDouble();

        //calculate simple interest
        double interest = (principal * rate * time)/ 100;

        // display the result
        System.out.println("Interest = £ " +interest);


    }
}
