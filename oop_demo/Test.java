public class Test{
    // POINT OF ENTRY METHOD
    public static void main(String args[]){
        // INSTANTIATING A NEW CAR
        Car edward_car = new Car("soft",4,true,"Grey");
        Car empty_car = new Car();
        Car alex_car = new Car("sport", 14, false, "Red");
        System.out.println(edward_car.getSuspension());

        edward_car.getAutomatic();
        edward_car.getColor();

        edward_car.setColor("Blue");

        System.out.println(edward_car.getColor());
    }
}