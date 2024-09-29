package sept.ex250924;

public class Lab075_Example4_initializationType {
    public static void main(String[] args) {
        for (float f = 0.0f; f < 10.67; f++) {
            System.out.println("Hi,Float -> " + f);
        }
        for (byte f = 0; f < 10.67; f++) {
            System.out.println("Hi,Byte -> " + f);
        }
        for (long i = 1; i < 10; i++) {
            System.out.println("Hi,Long -> " + i);
        }
        for (char c = 'a'; c <= 'z';c++){
            if(c == 'z'){
                System.out.print(c + ".");
            }else {
                System.out.print(c + ", ");
            }
        }
    }
}
