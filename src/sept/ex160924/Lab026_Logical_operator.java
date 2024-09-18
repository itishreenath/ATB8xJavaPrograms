package sept.ex160924;

public class Lab026_Logical_operator {
    public static void main(String[] args) {
        //2.Binary Operator(2 operands): d.logical Operators
        //which compare or perform Logical operation on two expression
        // ! - logical NOT, && - logical AND , || - logical OR
        /*
        *  !(T) -> F and !(F) -> T
        *  T && T -> T, T && F -> F, F && T -> F, F && F -> F
        *  T || T -> T, T || F -> T, F || T -> T, F || F -> F
        */
        boolean a = true;
        boolean b = false;
        boolean c1= a && b;
        boolean c2= a || b;
        System.out.println(c1); //T && F -> F
        System.out.println(!b); //!(F) -> T
        System.out.println(c2); //T || F -> T
    }
}
