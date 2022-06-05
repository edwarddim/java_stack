public class FireHuman extends Human{
    // MEMBER VARIABLE
    protected int fireResist;
    // CONSTRUCTOR
    public FireHuman(){
        super(); // CALLING THE PARENT CONSTRUCTOR CLASS
        this.fireResist = 2;
    }
    public FireHuman(String name, String hairColor, int height, int age, int fireResist){
        super(name, hairColor, height, age);
        this.fireResist = fireResist;
    }
    // GETTERS AND SETTERS
    public int getFireResist(){
        return this.fireResist;
    }

    public void setFireResist(int fireResist){
        this.fireResist = fireResist;
    }

    public void introduction(){
        super.introduction();
        System.out.println("I am from the fire nation");
        // System.out.println("I am " + this.name + " and I am from the fire nation");
    }

}