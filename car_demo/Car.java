public class Car{
    // MEMBER VARIABLES or ATTRIBUTES
    private int wheels;
    private int doors;
    private String color;
    private String engine;
    private boolean convertible;
    private int odometer;
    // CONSTRUCTOR METHODS
    // EMPTY CONSTRUCTOR
    public Car(){
        System.out.println("CREATING A DEFAULT CAR");
        this.wheels = 4;
        this.doors = 4;
        this.color = "Black";
        this.engine = "V4";
        this.convertible = false;
        this.odometer = 0;
    }
    // FULL CONSTRUCTOR
    public Car(int wheels, int doors, String color, String engine, boolean convertible){
        System.out.println("CREATING A CUSTON CAR");
        this.wheels = wheels;
        this.doors = doors;
        this.color = color;
        this.engine = engine;
        this.convertible = convertible;
        this.odometer = 0;
    }
    // OTHER METHODS
    // drive
    public Car drive(int distance){
        this.odometer += distance;
        System.out.println(this.odometer);
        return this;
    }
    // honk
    public void honk(){
        System.out.println("HONK HONK");
    }
    // start
    public void start(){
        System.out.println("VROOM VROOM");
    }
    // GETTERS / SETTERS
    public int getWheels(){
        return this.wheels;
    }

    public void setWheels(int newWheels){
        this.wheels = newWheels;
    }

    public int getOdometer(){
        return this.odometer;
    }
}