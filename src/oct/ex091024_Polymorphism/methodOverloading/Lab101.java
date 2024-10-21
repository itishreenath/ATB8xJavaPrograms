package oct.ex091024_Polymorphism.methodOverloading;

public class Lab101 {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();

        int result = m.add(3,4);
        System.out.println(result);

        String name = m.add("pramod","dutta");
        System.out.println(name);
    }
}
