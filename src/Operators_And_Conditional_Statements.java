public class Operators_And_Conditional_Statements {
    public static void main (String[] args){
        //Relational Operators
    // == equality operator
     //!= non-quality operator
     // < less than
     //> greater than
     //<= This is less than or equal to operator
     // >= This is the greater than or equal to operator

        //Logical Operator
        // && Logical and returns if both statements are true
        // || logical or - returns true if one of the statements is true
        // ! logical not - reverse the results, returns false if the result is true

    //Syntax for 'if', 'Else If', 'else'
        //if (condition) {
        // block of code to be executed if the condition is true}else if(condition){
        // block of code to be executed if the condition is true}else{
        //block of code to be executed if the condition is false}

        //conditional statements
        int myAge =30;
        int myScore = 15;
        //false result
        if(myAge == 30 && myAge < 35){
            System.out.println("It is equal for if");
            //true
        } else if (myAge >= 30){
            System.out.println("It is equal for else if");
        } else {
            System.out.println("no true condition");
        }
        System.out.println("This is outside the condition");

        //Task 5

        //Write a code to: If the number is divisible by 3, print Fizz instead of the number.
        //If the number is divisible by 5, print Buzz instead of the number.
        //If the number is divisible by 3 and 5 both, print FizzBuzz instead of the number.

        // fizz - 21 , buzz- 50 , fizzbuzz- 15
        int number= 21;

        if (number % 3 == 0 && number % 5 == 0 ){
            System.out.println("FizzBuzz");
        } else if(number % 5 ==0){
            System.out.println("Buzz");
        } else if(number % 3==0 ){
            System.out.println("Fizz");

        } else {
            System.out.println("Number is not divisible by 3 and 5");
        }




    }
}
