// OOP Language
public class Basic{
    // POINT OF ENTRY METHOD
    public static void main(String[] args){
        System.out.println("Hello World Again");
        // Types! Primitive VS Object
        // Declaring and Assigning Values

        // Primtive Data Types
        boolean flag = false; // true
        int number = 30;
        // float num = 3.22;
        double dubl = 2.14;
        char letter = 'a';

        // Object Data Type
        String name = "Edward Im";
        System.out.println(name.length());

        //Implicit Casting
        int a = 1;
        double b;
        b = a;
        System.out.println(a);
        System.out.println(b);

        // Explicit Casting 
        double x  = 1.0;
        int y;
        y = (int) x;


        Hello my_name = new Hello();
        my_name.sayHello();
    }

}
