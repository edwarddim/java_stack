import java.util.Arrays;
import java.util.ArrayList;

public class ArrayDemo{
    public void printArray(){
        int[] numArr = {1,2,3,4,5,6,7};

        numArr[0] = 14;
        // numArr[1] = "Edward Im";
        System.out.println(Arrays.toString(numArr));
        for(int i=0; i < numArr.length; i++){
            System.out.println(numArr[i]);
        }
    }
    public void printArrayList(){
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        intArr.add(1); // push
        intArr.add(2);
        intArr.add(3);
        intArr.add(4);
        System.out.println(intArr);
        intArr.remove(intArr.size() - 1); // pop

        // STANDARD FOR LOOP FOR MANIPULATING THE VALUES
        for(int i = 0; i < intArr.size(); i++){
            System.out.println(intArr.get(i));
        }
        // ENHANCED FOR LOOP FOR READING THE VAlUES
        // for(Integer pineapple : intArr){
        //     System.out.println(pineapple);
        // }
    }

    public String sayName(String name){
        return "Hello " + name;
    }

}