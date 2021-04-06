public class Test{
    public static void main(String args[]){
        User user_1 = new User();
        User user_2 = new User("Edward", "ed@gmail.com", "qwert12345", 30);

        System.out.println(user_1.getName());
        System.out.println(user_2.getName());

        try{
            user_2.setAge(-25);
        }
        catch (Error e){
            System.out.println(e);
        }
        
        user_2.introduction();
    }
}