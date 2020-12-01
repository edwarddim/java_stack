public class Test{
    public static void main(String args[]){
        Human human1 = new Human();
        AirHuman air1 = new AirHuman("Edward", "black", 30, 200, 2);
        SpaceHuman space1 = new SpaceHuman();
        human1.attack(air1);
        System.out.println(air1.health);
    }
}