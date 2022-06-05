public class CarLot{
    public static void main(String[] args){
        // INSTANTIATE A CAR
        Car edwards_car = new Car("Hyundai", "V4", 2014, 6000.00);
        Car emtpy_car = new Car();
        System.out.println(edwards_car.getMake());
        edwards_car.setMake("Honda");
        System.out.println(edwards_car.getMake());

        System.out.println(edwards_car.getPrice());
        // edwards_car.depreciateValue();
        edwards_car.setPrice(-5000.00);
        System.out.println(edwards_car.getPrice());
    }
}