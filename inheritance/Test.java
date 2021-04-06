public class Test{
    public static void main(String args[]){
        FireHuman zuko = new FireHuman();
        FireHuman iroh = new FireHuman("Iroh", "grey", 66, 60, 100);

        WaterHuman katara = new WaterHuman("Katara", "black", 65, 15 ,80);

        katara.attack(iroh);
        System.out.println(iroh.getAge());
        // zuko.introduction();
        // iroh.introduction();
    }
}