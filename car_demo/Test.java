public class Test{
    public static void main(String args[]){
        // INSTANTIATE CARS
        Car edwardCar = new Car();
        Car testCar = new Car("V8", 4, false, 100);

        // System.out.println(edwardCar.getOdometer());
        // edwardCar.setOdometer(10);
        // edwardCar.setOdometer(-1000);
        // System.out.println(testCar.getEngine());

        System.out.println(edwardCar.getOdometer());
        edwardCar.drive(15);
        edwardCar.drive(15);
        System.out.println(edwardCar.getOdometer());



    }
}