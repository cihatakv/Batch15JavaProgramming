package exercise.volkanIstek;

public class MathematicalOperators {
    public static void main(String[] args) {
        float a = 3.4f;
        float b = 50.2f;
        float c = 2.1f;
        float d = 0.55f;
        float e = 44.5f;
        float f = 5.9f;

        // x = (ed - bf) / (ad - bc)

        // y = (af - ec) / (ad - bc)

        float x = (e * d - b * f) / (a * d - b * c);
        float y = (a * f - e * c) / (a * d - b * c);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
