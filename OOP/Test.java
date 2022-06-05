import java.lang.Math;
import java.util.Random;
import java.util.Arrays;

public class Test{
    public static void main(String args[]){
        // User user_1 = new User();
        // User user_2 = new User("Edward", "ed@gmail.com", "qwert12345", 30);

        // System.out.println(user_1.getName());
        // System.out.println(user_2.getName());

        // try{
        //     user_2.setAge(-25);
        // }
        // catch (Error e){
        //     System.out.println(e);
        // }
        
        // user_2.introduction();

        // Math calculator = new Math();
        // calculator.sqrt(5.0);

        // ALL METHODS ARE STATIC SO ARE CALLED ON CLASS ITSELF
        Math.sqrt(5.0);

        // ALL METHODS ARE NOT STATIC SO YOU HAVE TO INSTANTIATE
        // Random randomGenerator = new Random();
        // randomGenerator.nextInt();

        User.printPopulation();

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        User.printPopulation();

        int[] nums = {1,23,4,6,7};

        System.out.println(Arrays.toString(nums));


    }
}