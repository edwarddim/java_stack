import java.lang.Math;

public class Pythagorean{
    public double calculateHypotenuse(int legA, int legB) {
        int aSquare = legA * legA;
        int bSquare = legB * legB;
        double answer = Math.sqrt(aSquare + bSquare);
        return answer;
    }
}