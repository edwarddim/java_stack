public class User{

    private String name;
    private int age;

    // CONSTRUCTORS
    public User(){
        this.name = "Default";
        this.age = 0;
    }

    public User(String givenName, int givenAge){
        this.name = givenName;
        this.age = givenAge;
    }
}