package sept.ex160924;

public class Lab020_CompoundAssignment_operator {
    public static void main(String[] args) {
        //  1.Unary Operator: b.Compound Assignment Operator
        // += ,-= , *=, /=
        int a = 10;
        a += 20; // a = a+20(10+20) ,after this line a = 30
        a -= 20; // a = a-20(30-20) ,after this line a = 10
        a /= 10; // a = a/10(10/10) ,after this line a = 1
        a *= 10; // a = a*10(1*10),after this line a = 10

        System.out.println(a);
    }
}
