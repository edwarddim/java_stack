public class Car{
    // ATTRIBUTES & MEMBER VARIABLES
    private String make;
    private String engine;
    private int model_year;
    private double price;
    // CONSTRUCTOR METHODS
    public Car(){
        System.out.println("CONSTRUCTOR METHOD FOR NO ARGUMENTS");
        this.make = "DEFAULT MAKE";
        this.engine = "V4";
        this.model_year = 0;
        this.price = 0.00;
    }
    public Car(String make, String engine, int model_year, double price){
        System.out.println("YOUR CAR IS BEING INSTANTIATED");
        this.make = make;
        this.engine = engine;
        this.model_year = model_year;
        this.price = price;
    }
    // GETTER(READ) AND SETTER(CREATE/UPDATE) METHODS
    public String getMake(){
        return this.make;
    }
    public String getEngine(){
        return this.engine;
    }
    public int getModelYear(){
        return this.model_year;
    }
    public double getPrice(){
        return this.price;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }
    public void setModelYear(int model_year){
        this.model_year = model_year;
    }
    public void setPrice(double price){
        if(price <  0){
            System.out.println("YOU CAN'T SET NEGATIVE PRICE");
        }
        else{
            this.price = price;
        }
    }
    // OTHER METHODS
    public void depreciateValue(){
        this.price = this.price / 2;
    }

}