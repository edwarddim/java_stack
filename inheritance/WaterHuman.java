public class WaterHuman extends Human{
    protected int waterResist;

    public WaterHuman(){
        super();
        this.waterResist = 0;
    }

    public WaterHuman(String name, String hairColor, int height, int age, int waterResist){
        super(name, hairColor, height, age);
        this.waterResist = waterResist;
    }

}