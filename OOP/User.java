// 4 PILLARS OF OOP
// ABSTRACTION
// ENCAPSULATION

// INERTIANCE
// POLYMORPHISM

public class User{
    // MEMBER VARIABLES (ATTRIBUTES)
    private String name;
    private String email;
    private String password;
    private int age;
    // CLASS VARIABLES
    public static int numOfPeople;
    // CONSTRUCTOR METHODS
    public User(){
        this.name = "DEFAULT NAME";
        this.email = "DEFAULT EMAIL";
        this.password = "DEFAULT PASSWORD";
        this.age = 0;
        numOfPeople++;
    }
    public User(String name, String email, String password, int age){
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        numOfPeople++;
    }
    // GETTERS AND SETTERS METHODS
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    public String getPassword(String adminPass){
        if(adminPass == "qwery12345"){
            return this.password;
        }
        else{
            System.out.println("ACCESS DENIED");
            return "ACCESS DENIED";
        }

    }
    public void setPassword(String newPassword){
        this.password = newPassword;
    }
    
    public int getAge(){
        return this.age;
    }
    public void setAge(int newAge){
        if(newAge < 0){
            throw new Error("Age is not valid");
        }
        else{
            this.age = newAge;
        }
    }
    // OTHER METHODS
    public void introduction(){
        System.out.println("Hello my name is " + this.name);
    }

    // CLASS METHOD
    public static void printPopulation(){
        System.out.println(numOfPeople);
    }
}