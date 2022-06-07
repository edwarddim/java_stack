public class Test{
    public static void main(String args[]){
        // INSTANTIATE A CAR
        Car defaultCar = new Car();
        
        Car armenCar = new Car(4, 4, "White", "V8", true);
        System.out.println(armenCar.getWheels());
        armenCar.setWheels(6);

        // System.out.println(armenCar.drive(5));
        // System.out.println(armenCar.drive(5));
        // System.out.println(armenCar.drive(5));
        // System.out.println(armenCar.drive(5));
        // System.out.println(armenCar.drive(5));

        armenCar.drive(5).drive(5).drive(5);
    }
}