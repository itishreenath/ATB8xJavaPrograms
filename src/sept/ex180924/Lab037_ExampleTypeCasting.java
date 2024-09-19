package sept.ex180924;

public class Lab037_ExampleTypeCasting {
    public static void main(String[] args) {

        // GST = 18.45;
        int course = 100;
        float GST = 18.45f;
        //int total_price = course+GST; // Narrowing - Implicit - JVM - Invalid
        //float total_price = course+GST; // Widening - Implicit - JVM - Invalid

        int total_price = course+(int)GST; // Narrowing - Explicit - LOSS
        System.out.println(total_price);
    }
}
