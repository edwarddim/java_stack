import java.util.Arrays;
import java.util.ArrayList;

public class ArrayDemo{
    public void arrayTest(){
        // ARRAYS
        int[] numArr;
        numArr = new int[5];
        System.out.println(Arrays.toString(numArr));
        numArr[0] = 4;
        numArr[1] = 8;
        numArr[2] = 8;
        numArr[3] = 5;
        numArr[4] = 9;
        System.out.println(Arrays.toString(numArr));

        // STANDARD FOR LOOP
        for(int i = 0; i < numArr.length; i++){
            System.out.println(numArr[i]);
        }
    }

    public void arrayListTest(){
        // ArrayLists
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        System.out.println(myArray);
        myArray.remove(myArray.size() - 1);

        // STANDARD FOR LOOP - MANIPULATE THE VALUES WITHIN THE ARRAY LIST
        for(int i = 0; i < myArray.size(); i++){
            System.out.println(myArray.get(i));
        }

        // ENHANCED FOR LOOPS - READING THE VALUES
        for(Integer num : myArray){
            System.out.println(num);
        }
    }


    public String hello(String name){
        return "Hello " + name;
    }

    public int getStreakGoal(){

    }

    public double getOrderTotal(double[] prices){
        
    }
}