public class BasicArithmeticOperators {
    public static void main(String[] args) {
        //basic arithmetic
        double age1 =20;
        double age2 = 30;


        System.out.println(age1+age2);
        System.out.println(age1-age2);
        System.out.println(age1*age2);
        System.out.println(age1/age2);
      // Dividing age1/age 2 will be 0 because byte produces whole numbers
        // alternatively I can change the data type to float or double

        //Incremental and Decremental Operators

        //age1++; to add 1 to age, age-- to deduct 1 from age
        //age1--;
        //System.out.println(age1);

        //compound assignment operators -= += /= *=
        //age1 -= age2;
        // the above means the result of 2nd var will be assigned to the 1st variable
        //20-30 =-10;
        // age1 = -10
        age1 += age2;
        //20+30 = 50;
        // age1 = 50

        System.out.println(age1);

        //Task 4 find the area of a circle with radius on12.7m.
        // Print out your result with the unit of measurement which is metres.

        double pi =3.14;
        double radius= 12.7*12.7;
        double areaOfCircle = pi*radius;
        System.out.println(areaOfCircle);



    }
}
