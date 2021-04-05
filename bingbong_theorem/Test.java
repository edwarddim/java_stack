public class Test{
    public static void main(String[] args){
        System.out.println("HEllo World");

        // INSTANTIATING A BINGBONG OBJECT
        // AND STORING INSIDE OF VARIABLE TESTER
        BingBong tester = new BingBong();
        // tester.sayHello();

        // STORING DATA IN VARIABLE THEN PRINTING
        double result = tester.calculateBingBong(4,5);
        System.out.println(result);

        // PRINTING THE METHOD CALL
        System.out.println(tester.calculateBingBong(10,10));
    }
}