public class JavaBasic{
    // POINT OF ENTRY METHOD
    public static void main(String args[]){
        System.out.println("Hello World");
        System.out.println("Hello again");

        // PRIMITIVE TYPES
        // int
        int count = 12;
        int age = 31;
        // boolean
        boolean flag = false; // true
        // double
        double dbl_price = 30.02;
        // char
        char letter = 'a';

        // OBJECT TYPES
        // String
        String name = "Edward Im";
        System.out.println(name.length());

        // TYPE CASTING
        // implicit casting
        int price = 1;
        double new_price;
        new_price = price;
        System.out.println(new_price);

        // explicit casting
        double a = 1.0;
        int b;
        b = (int) a;
        System.out.println(b);




        // Normal string assignment
        String a = "same string";
        String b = "same string";
        System.out.println(a == b); // true



        
        // Creating new strings as separate objects (another way to create a String)
        a = new String("same letters");
        b = new String("same letters");
        System.out.println(a == b); // false. Not the same object in memory.
        System.out.println(a.equals(b)); // true. same exact characters.
    }
}