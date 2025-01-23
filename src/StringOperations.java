public class StringOperations {
    public static void main(String[] args) {

        String word= "orGANization";

        //uppercase and lowercase
        System.out.println(word.toUpperCase());

        //0 1 3 4 5 6 index from the beginning
        //l e n g t h length = 6 character
        //-6 -5 -4 -3 -2 -1 if you're indexing from the last letter
        // length
        System.out.println(word.length());
        //index of a character
        System.out.println( word.indexOf("G"));

        // char at a particular index
        System.out.println(word.charAt(6));

        // substring -splitting the word, does not include the last index number
        System.out.println(word.substring(0,5));

        System.out.println(word.charAt(word.length()-1));

        //Task 6
        //Write a code to reverse the string DEMOCRACY and get the word COME out of it.
        String taskWord = "DEMOCRACY";
        String reverseWord = new StringBuilder(taskWord).reverse().toString();
        System.out.println(reverseWord.substring(4,8));



    }
}
