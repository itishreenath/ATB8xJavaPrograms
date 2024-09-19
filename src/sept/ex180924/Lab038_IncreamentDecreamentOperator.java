package sept.ex180924;

public class Lab038_IncreamentDecreamentOperator {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--) Operators
        // 1. Pre-Increament/Decreament -Syntax: ++/--[operand] - First Increase/decrease Then Assign
        //this means it will first Increase/decrease the value of the operand by 1 then assign that vaule to the variable
        int a  = 10;
        System.out.println("The initial value of a: "+a);
        int b  = ++a; // a = a+1
        System.out.println("The value of b: "+b);
        System.out.println("After preincreament the value of a: "+a);
        b=--a;
        System.out.println("The value of b: "+b);
        System.out.println("After predecreament the value of a: "+a);

        // 2. Post-Increament/Decreament -Syntax: [operand]++/-- - First Assign Then Increase/decrease
        //this means it will first assign that vaule to the variable then Increase/decrease the value of the operand by 1
        int c  = 10;
        System.out.println("The initial value of c: "+c);
        int d  = c++; // c = c+1
        System.out.println("The value of d: "+d);
        System.out.println("After postincreament the value of c: "+c);
        d=c--;
        System.out.println("The value of d: "+d);
        System.out.println("After postdecreament the value of c: "+c);

    }
}
