public class Hello{
    // ATTRIBUTES

    // CONSTRUCTORS
    public Hello(){
        System.out.println("Hello object created");
    }
    public Hello(String word, int age){
        String result = String.format("Your word is %s and your age is %d", word, age);
        System.out.println(result);
        // System.out.println("Your word is " + word);
        // System.out.println("Your age is " + age);
    }
    // GETTERS / SETTERS / OTHER METHODS

    public String sayGreeting(String watermelon){
        // System.out.println("Your greeting is " + greeting);
        return "Your greeting is " + watermelon;
    }
}