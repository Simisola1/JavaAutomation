import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        //single and multi dimensional Arrays
        //inbuilt array and Arraylist
        // inbuilt array- size of an array cannot be modified, you have to create a new one to add or remove
        //Arraylist - elements can be added and removed.

        //in the syntax below '[5]' stands for the length of the array
        int [] array1= new int [5];
        array1 [0] =10;
        array1[1]= 1;
        array1[4] = 4;
        //System.out.println(Arrays.toString(array1));

        //Single dimensional array
        String [] fruits = { "mango", "apple", "guava"};
        System.out.println(Arrays.toString(fruits));

        //Multi- dimensional array [0] [0] stands for index, [2] means 2 columns and [3] means 3 rows each

        int[] [] doubleDimen= new int[2][3];
        doubleDimen[0][0]=20;
        doubleDimen[0][1] = 30;
        System.out.println(Arrays.deepToString(doubleDimen));

        //ArrayList
        ArrayList arr =new ArrayList();
        arr.add(("test"));
        arr.add(10);
        System.out.println(arr);
        //The method above allows any data type string/int etc

        //Restricted data type to string insert the <>
        //ArrayList <String> arr = new ArrayList<String>();
        // you can also use different methods such as name of variable .get, .remove and includeindex no.

        //Task 7
        //create a two-dimensional array with 4 rows and 3 columns.
        // Fill only the first column with any fruits of ur choice

       String[] [] favFruits =new String [3][4];
       favFruits [0][0] ="Pineapple";
       favFruits [0][1] ="Apple";
       favFruits [0][2]="Coconut";
       favFruits [0][3]="Orange";
        System.out.println(Arrays.deepToString(favFruits));




    }
}
