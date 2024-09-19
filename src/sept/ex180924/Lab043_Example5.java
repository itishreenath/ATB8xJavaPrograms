package sept.ex180924;

public class Lab043_Example5 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Initial value of a: "+a);
        int result = a--;
        System.out.println(result);
        System.out.println("After Post decreament a: "+a);
        result = --a;
        System.out.println(result);
        System.out.println("After Pre decreament a: "+a);
    }
}
