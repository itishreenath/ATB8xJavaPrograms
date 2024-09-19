package sept.ex180924;

public class Lab034_DatatypeAddResultType {
    public static void main(String[] args) {
        /*First Operand type + Second operand type = result type
         * byte              + byte                = int
         * char              + char                = int
         * short             + byte                = int
         * int               + int                 = int
         * int               + long                = long
         * byte              + double              = double
         * float             + int                 = float
         * float             + long                = float
         * char              + double              = double
         * int               + double              = double
         * char              + int                 = int
         * short             + char                = int
         * short             + float               = float
         */
        byte a = 10;
        byte b = 10;
        int c = a + b;
        //byte c1 = a+b;
        System.out.println(c);

        char a1 = 'A'; // 65
        System.out.println(a1);
        char b1 = 'B'; //66
        int c1 = a1 + b1;
        System.out.println(c1); // 131

        short s = 10;
        char ch = 'A'; //65
        int result = s + ch;
        System.out.println(result);

    }
}
