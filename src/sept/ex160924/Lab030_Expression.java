package sept.ex160924;

public class Lab030_Expression {
    public static void main(String[] args) {
        int a = 12;
        boolean b = !(a > 10 || a < 5); //whole value part is known as expression
        // !(true); -> false
        //  BODMAS rule applied i.e.
        //  Bracket, Of, Division, Multiplication, Addition, and Subtraction.
        System.out.println(b);
    }
}
