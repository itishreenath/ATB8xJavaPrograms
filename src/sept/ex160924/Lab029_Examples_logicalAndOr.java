package sept.ex160924;

public class Lab029_Examples_logicalAndOr {
    public static void main(String[] args) {
        //Logical OR: T || T -> T, T || F -> T, F || T -> T, F || F -> F
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //Logical AND: T && T -> T, T && F -> F, F && T -> F, F && F -> F
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

    }
}
