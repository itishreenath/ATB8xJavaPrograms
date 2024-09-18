package sept.ex160924;

public class Lab021_Arithmetic_operator {
    public static void main(String[] args) {
        //2.Binary Operator(2 operands): a.Arithmetic Operator
        // to perform arithmetic operations on 2operands
        // +,-,/,*
        int a = 10;
        int b = 2;
        // 2 operands are a,b
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        // % - Modulus - Remainders
        System.out.println(a%b);

//        2 | 10 | 5 - Quoient
//          | 10 |
//          -------
//             0 - Remainder

        System.out.println(67%13);

//        13 | 67 | 5
//           | 65 |
//           -------
//              2
    }
}
