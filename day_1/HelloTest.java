// IMPORT DEPENDENCIES
import java.util.Arrays;
import java.util.ArrayList;

// Pascal Case & Singular
public class HelloTest{
    // POINT OF ENTRY METHOD / MAIN METHOD
    public static void main(String args[]){

        int age = 32;

        // Hello emptyConstructor = new Hello();
        
        // INSTANTIATING OBJECT FROM Hello CLASS
        // Hello helloObject = new Hello("Watermelon", 32);

        // String returnString = helloObject.sayGreeting("Hola");
        // System.out.println(returnString);

        // System.out.println(helloObject.sayGreeting("Hello"));


        // INSTANTIATE 2 USERS
        // User person1 = new User();
        // User person2 = new User("Edward Im", 32);

        // person1.introduction();
        // person2.introduction();



        // ARRAYS
        int[] myArray;
        myArray = new int[5];

        int[] newArray = {1,2,3,4,5};
        
        System.out.println(myArray);
        System.out.println(Arrays.toString(myArray));

        System.out.println(newArray);
        System.out.println(Arrays.toString(newArray));

        // for(int i = 0; i < myArray.length; i++){
        //     System.out.println(myArray[i]);
        // }


        // ARRAYLISTS
        ArrayList<String> nameList = new ArrayList<String>();
        System.out.println(nameList);
        // push
        nameList.add("Edward");
        nameList.add("John");
        nameList.add("Jane");
        nameList.add(0,"Sobhit");
        // pop
        // nameList.remove(0); // int
        // nameList.remove("Edward"); // String

        System.out.println(nameList);
        nameList.remove("Steven");
        System.out.println(nameList);

        // 
        for(int i = 0; i < nameList.size(); i++){
            System.out.println(nameList.get(i));
        }

        // ENHANCED LOOPS - READ OPERATIONS
        for(String name : nameList){
            System.out.println(name);
        }

    }
}