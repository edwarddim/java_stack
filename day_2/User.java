public class User{
    // MEMBER VARIABLES
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    // CONSTRUCTOR METHOD
    public User(){
        this.first_name = null;
        this.last_name = null;
        this.email = null;
        this.password = null;
    }
    public User(String first_name, String last_name, String email, String password){
        System.out.println("CREATING A NEW USER");
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
    }
    // GETTERS
    public String getFirstName(){
        return this.first_name;
    }
    public String getLastName(){
        return this.last_name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
    // SETTERS
    public void setFirstName(String new_name){
        this.first_name = new_name;
    }
    public void setLastName(String new_name){
        this.last_name = new_name;
    }
    // OTHERS
    public void greet(){
        System.out.println("Hello my name is " + this.first_name + " " + this.last_name);
    }
}