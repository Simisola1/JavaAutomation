public class JavaLoops {
    public static void main(String[] args) {
        // loop is used to execute a set of statements repeatedly until a boolean condition is false
        // 3 types of loops: for loop, while loop and do-while loop
        // if the number of iteration is fixed: use for loop if not use while and do while
        // for "i" loop syntax : for( initializing statement;testing condition; increment/decrement){
        //code to iterated }
        //for each loop: for(<datatype><variable_name> : <collection_name>){
        //statements; }

        //for i increment print numbers 1 to 10
        //for (int i = 0; i <= 10; i++) {
        //    System.out.println("Students: " + i);
       // }

        //for i decrement
        //for (int i = 10; i>=5; i--) {
         //   System.out.println("Students: " + i);
       // }

        //for each loop
        //String [] fruits ={"mango", "banana", "Apple"};
        //for (String vName: fruits) {
         //   System.out.println(vName);
       // }

        //Task 9A
        //I have a list of numbers, 1-10,
        // write a loop that prints odd if it is an odd number
        // and a loop that prints even if it is an even number
        int [] numbers= {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        for( int number:numbers){
            if (number % 2 == 0){
                System.out.println(number + " is Even");
            } else{
                        System.out.println(number + " is Odd");
                    }
                }

            }
        }

