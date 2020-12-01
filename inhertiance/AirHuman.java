public class AirHuman extends Human {
    protected int wings;
    public AirHuman(){
        super();
        this.wings = 2;
    }
    public AirHuman(String name, String hairColor, int age, int weight, int wings){
        super(name, hairColor, age, weight);
        this.wings = wings;
    }
}