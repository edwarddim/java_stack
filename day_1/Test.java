import java.util.Arrays;
import java.util.ArrayList;

public class Test{
    public static void main(String[] args){
        // Arrays VS ArrayList
        String name = "Edward Im";
        ArrayList<Integer> some = new ArrayList<Integer>();
        
        // INSTANTIATE AN ArrayDemo OBJECT 
        ArrayDemo arrDemo = new ArrayDemo();

        arrDemo.printArray();
        arrDemo.printArrayList();

        String intro = arrDemo.sayName("Edward Im");
        System.out.println(intro);
    }
}