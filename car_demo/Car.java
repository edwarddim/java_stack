public class Car{
    // MEMBER VARIABLES, ATTRIBUTES
    private String engine;
    private int wheels;
    private boolean automatic;
    private int odometer;

    // CONSTRUCTOR METHODS
    // EMPTY CONSTRUCTOR
    public Car(){
        System.out.println("DEFAULT CAR BEING MADE");
        this.engine = "V4";
        this.wheels = 4;
        this.automatic = true;
        this.odometer = 0;
        // this("V4", 4, true, 0);
    }

    // FULL CONSTRUCTOR
    public Car(String engine, int wheels, boolean automatic, int odometer){
        System.out.println("CUSTOM CAR BEING MADE");
        this.engine = engine;
        this.wheels = wheels;
        this.automatic = automatic;
        this.odometer = odometer;
    }

    // GETTERS / SETTERS / OTHER METHODS

    public void drive(int mileage){
        this.odometer += mileage;
    }

    // GETTER ENGINE
    public String getEngine(){
        return this.engine;
    }
    // SETTER ENGINE
    public void setEngine(String engine){
        this.engine = engine;
    }

    public int getOdometer(){
        return this.odometer;
    }
    public void setOdometer(int odometer){
        if(odometer > 0){
            this.odometer = odometer;
        }
        else{
            System.out.println("That doesn't make sense");
        }
    }

}