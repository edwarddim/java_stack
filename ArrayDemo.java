import java.util.ArrayList;

public class ArrayDemo{

    public static void main(String args[]){
        // Array VS ArrayList

        // Array (static)
        int[] arrays;
        arrays = new int[10];

        int[] newArrays = {1,2,3,4,5,6,7,8,9,10};

        // ArrayList (dynamic)
        ArrayList<int> intArrayList = new ArrayList<int>();
        intArrayList.add(0); //push
        intArrayList.add(1); //push
        intArrayList.remove(intArrayList.size()-1); //pop
    }

    public ArrayList<int> methodName(){
        ArrayList<int> newList = new ArrayList<int>();
        for(int i = 0; i < 256; i++){
            newList.add(i);
        }
        return newList;
    }



}