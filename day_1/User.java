public class User{
    // ATTRIBUTES
    public String name;
    public int age;

    // EMPTY CONSTRUCTOR
    public User(){
        this.name = "Default";
        this.age = 0;
    }
    // FULL CONSTRUCTOR
    public User(String givenName, int givenAge){
        this.name = givenName;
        this.age = givenAge;
    }

    // GETTERS / SETTERS / OTHER METHODS
    public void introduction(){
        System.out.println("Hello my name is " + this.name + " and I am " + this.age + " years old");
    }
}