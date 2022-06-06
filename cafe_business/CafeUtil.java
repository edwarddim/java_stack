import java.util.ArrayList;

public class CafeUtil{
    /* 
    Cafe Java wants to implement a reward system for customers who always buy more drinks than they did the week before. To calculate how many drinks they need after 10 weeks, write a method that sums together every consecutive integer from 1 to 10 and returns the sum. In other words, add 1 + 2 + 3.. and so on up to 10 and return the result.

    Test your code before moving on! Don't forget to make an instance of your CafeUtil class to use in the test file. The number printed should be 55.

    */
    public int getStreakGoal(){
        int total = 0;
        for(int i = 1; i < 11; i++){
            total += i;
            // total = total + i;
        }
        return total;
    }

    public double getOrderTotal(double[] prices){

    }

    // public void displayMenu(ArrayList<String> menuItems){

    // }

    // public void addCustomer(ArrayList<String> customers){
        
    // }
}