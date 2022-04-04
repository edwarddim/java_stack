public class Test{
    // POINT OF ENTRY METHOD
    public static void main(String args[]){
        // INSTANTIATE THE ARRAY DEMO OBJECT
        ArrayDemo test = new ArrayDemo();

        String name = "Edward Im";

        test.arrayTest();
        test.arrayListTest();
        System.out.println(test.hello("Edward"));


        test.getStreakGoal();

        double[] doubleArr = {3.2, 2.1, 5.6, 8.8};
        test.getOrderTotal(doubleArr);
    }
}