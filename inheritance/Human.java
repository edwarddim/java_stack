public class Human{
    // MEMBER VARIABLES
    protected String name;
    protected String hairColor;
    protected int height;
    protected int age;
    // CONSTRUCTOR
    public Human(){
        this.name = "DEFAULT NAME";
        this.hairColor = "BLACK";
        this.height = 0;
        this.age = 0;
    }
    public Human(String name, String hairColor, int height, int age){
        this.name = name;
        this.hairColor = hairColor;
        this.height = height;
        this.age = age;
    }
    // GETTERS AND SETTERS
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    // OTHER METHODS
    public void introduction(){
        System.out.println("Hello my name is " + this.name);
    }

    public void attack(Human target){
        System.out.println(this.name + " attack "+ target.getName());
        int age = target.getAge();
        age++;
        target.setAge(age);
    }
}