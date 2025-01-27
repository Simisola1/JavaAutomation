import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        //While loops are recommended if the loop count is not fixed
        //do while: when the loop needs to run at least once

        //While loop ideal for credential validations
        //"!" means does not equal ,
        // \ ensures the program ignores the use of double quotes within double quote

       // Scanner scanner = new Scanner(System.in);
       // String userInput = "";

        //while (!userInput.equalsIgnoreCase("exit")){
            //System.out.println("Welcome, type \"exit\" to exit this loop");
           // userInput=scanner.nextLine();
        //}
        // to avoid typing/replace"!userInput.equalsIgnoreCase("exit")" you can just type true
        // that is  while(true)

   // while (true){
     //   if (!userInput.equalsIgnoreCase("exit")) {
     //       System.out.println("Welcome, type \"exit\" to exit this loop");
   //         userInput = scanner.nextLine();
   //         continue;
    //    } else if (userInput.equalsIgnoreCase("exit")){
    //        System.out.println("You are out of the loop");
    //        break;
     //   }
       // System.out.println("Hello");

       // }
        //break and continue

        //do {
          //  System.out.println("welcome, type exit to leave");
         //   userInput = scanner.nextLine();
       // }while(!userInput.equalsIgnoreCase("exit"));

        //Task 9B
        //Write a logic that takes in input from the user.
        // It keeps printing "try again "until the user enters "testify"

        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (true) {
            if (!userInput.equalsIgnoreCase("Testify")) {
                System.out.println("Try again, type \"Testify\" to exit this loop");
                userInput = scanner.nextLine();
                continue;
            } else if (userInput.equalsIgnoreCase("Testify")) {
                System.out.println("You are out of the loop");
                break;
            }
        }


    }
}
