import java.util.Arrays;
import java.util.ArrayList;

public class Basic{
    public static void main (String args[]){
        // TYPES! PRIMITIVE VS. OBJECT
        boolean flag = false;
        int number = 30;
        char letter = 'a';
        String name = "Edward";
        // DECLARING AND ASSIGNING VALUES
        // EXPLICIT VS IMPLICIT CASTING
        // EXPLICIT
        double dec = 32.22;
        int age;
        age = (int) dec;
        System.out.println(age);

        // IMPLICIT
        int a = 1;
        double b;
        b = a;
        System.out.println(b);
        // LOOPS! ARRAYS VS ARRAYLISTS
        // ARRAY (Static)
        int[] array;
        array = new int[10];
        System.out.println(Arrays.toString(array));

        int[] newArray = {1,2,3,4,5,6};
        // ARRAYLIST (Dynamic)
        ArrayList<Object> newArr = new ArrayList<Object>();
    }
    public ArrayList<int> add(int a, int b){
        ArrayList<int> newArr = new ArrayList<int>();
        newArr.add(0);
        newArr.add(1);
        newArr.add(2);
        return newArr;
    }
    public void sayHello(){
        System.out.println("Hello Everyone!");
        return "Hello!";
    }
}