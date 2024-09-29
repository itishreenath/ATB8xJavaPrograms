package sept.ex250924;

public class Lab074_Example3_Infiniteloops {
    public static void main(String[] args) {
        final boolean b1 = true;
        //b1 = false; // final this is fixed now

        for (int i = 0; b1; i++) { //since b1 = true ,this is an infinite loop as the condition will always be true
            System.out.println("Hello");
        }

//        for (int i = 0; ; ) { //no condition no increament/decreament -> infinite loop
//            System.out.println("Hello");
//        }

//        for (; ; ) { //no initialization no condition no increament/decreament -> infinite loop
//            System.out.println("Hello");
//        }
    }
}
