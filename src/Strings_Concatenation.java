public class Strings_Concatenation {
    public static void main(String[] args){
        //string and string concat
        String bird = "hummingbird";
        String adjective = " is beautiful";
        String newString = bird + adjective;

        //System.out.println(bird + adjective);
        //System.out.println(newString);

        // string and primitive concat
        String movieName ="Matrix: ";
        int parts = 4;
        boolean isReleased =false;
        //System.out.println(""+ parts + isReleased);

        //.concat() method


        //System.out.println(movieName.concat(parts +""));

        //Create a variable and store your age in it.
        // concatenate your age with a string and print it out on the console using the two methods of concatenation

        int age =23;
        String name ="Simi is ";
        String ageName= name + age;

        System.out.println(ageName);

        System.out.println(name.concat(age +" years old"));







    }
}
