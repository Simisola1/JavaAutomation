import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //Java Methods
        //1.Predefined methods: already defined in Java class libraries,
        // known as built in method or standard libraries methods e.g length(), equals()
        //2. User defined methods: written by user/programmer, modified according to user requirements.

        //Structure of a method: Public String  myFullName (parameter){ code to be executed}

        //to access properties of a class, we create an object of the class
        Methods methodVar = new Methods();
        methodVar.printName();
        methodVar.myAge(50);

        int userAge = methodVar.ageCalculator(1993, 2021);
        System.out.println(userAge + "is the calculated age.");
        methodVar.userAttendance();





    }

    public void printName() {
        System.out.println("This is Simi.");
    }

    public void myAge(int age) {
        System.out.println("My age is " + age);
    }

    // methods with return type
    public int ageCalculator(int dob, int presentYear) {
        int age = presentYear - dob;
        return age;

    }
    //Task 10
    //Create a method that verify that visitors on the slack channel are coming fot testify Trainings.
    // If they write" Testify" then print out a  welcome messsage if not , theuser should be shown rejection message.
    // after creating this method,then invoke the created method in your main method

    public void userAttendance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Password:");
        String userInput = scanner.nextLine();
        while (true) {
            if (!userInput.equalsIgnoreCase("Testify")) {
                System.out.println("Access Denied");
                userInput = scanner.nextLine();
                continue;

            } else if (userInput.equalsIgnoreCase("Testify")) {
                System.out.println("Welcome to Testify Training");
                break;


            }
        }
    }
}

