import java.lang.Math;

public class BingBong{
    public double calculateBingBong(int legA, int legB){
        double answer = legA + legB;
        answer = Math.sqrt(answer);
        return answer;
    }

    public void sayBingBong(){
        System.out.println("BING BONG");
    }
}