/* 
WHAT IS JAVA
 - Interpeted VS Compiled

HOW TO RUN JAVA CODE
 - COMPILE THEN RUN

VARIABLES IN JAVA
CONDITIONALS AND LOOPS

*/
public class JavaBasic{
    // POINT OF ENTRY METHOD
    public static void main(String[] args){
        System.out.println("Hello Pineapple");
        // PRIMITIVE TYPES
        // int
        int age  = 30;
        // boolean
        boolean flag = true; // false
        // float
        float float_price = 30;
        // double
        double another_price = 19.99;
        // char
        char letter = 'a';

        // OBJECT DATA TYPE
        // String
        String name = "Edward Im";
        System.out.println(name.length());

        // TYPE CASTING
        // Implicit Casting
        int price = 1;
        float new_price;
        new_price =  price;
        System.out.println(price);
        System.out.println(new_price);
        // Explicit Casting
        double a = 1.0;
        int b;
        b = (int) a;
        System.out.println(a);
        System.out.println(b);

        boolean raining = true;
        // if(raining){
        //     System.out.println("Take an umbrella");
        // }
        // else if(some_condition){
        //     System.out.println("Something else")
        // }
        // else{
        //     System.out.println("It's sunny out, wear shorts");
        // }


        String pineapple = "Edward Im";
        String another = new String("Edward Im");
        if(another.equals("Edward Im")){
            System.out.println("Match");
        }

    }
}