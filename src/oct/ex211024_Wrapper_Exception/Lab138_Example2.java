package oct.ex211024_Wrapper_Exception;

public class Lab138_Example2 {
    public static void main(String[] args) {
        int a = 10;
        int c = a/0; // java.lang.ArithmeticException - Terminated
        System.out.println(c);
        System.out.println("End");
    }
}
