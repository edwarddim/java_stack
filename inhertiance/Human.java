public class Human{
    protected String name;
    protected String hairColor;
    protected int age;
    protected int weight;
    protected int health;
    public Human(){
        this.name = null;
        this.hairColor = null;
        this.age = 0;
        this.weight = 0;
        this.health = 100;
    }
    public Human(String name, String hairColor, int age, int weight){
        this.name = name;
        this.hairColor = hairColor;
        this.age = age;
        this.weight = weight;
        this.health = 100;
    }
    public String getName(){
        return this.name;
    }
    public void attack(Human person){
        person.health -= 5;
    }
}