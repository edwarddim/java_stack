public class Test{
    public static void main(String args[]){
        // INSTANTIATING A NEW PYTHAGOREAN OBJECT
        Pythagorean calculator = new Pythagorean();
        // CALLING THE CALCULATEHYPOTENUSE METHOD
        double answer = calculator.calculateHypotenuse(4,5);
        // PRINTING ANSWER
        System.out.println(answer);
        
        System.out.println(calculator.calculateHypotenuse(10,10));
        System.out.println(calculator.calculateHypotenuse(1,2));
        System.out.println(calculator.calculateHypotenuse(8,8));
    }
}