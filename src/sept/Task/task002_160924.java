package sept.Task;

public class task002_160924 {
    public static void main(String[] args) {
        /* Q1: Difference between = and  == ?
           Ans:a - '=' is an unary operator which is used to assign vaule to a single operand or variable.
                 - This is know as Assignment Operator
               b - '==' is a binary operator which compare the value of two operand or variable and returns a boolean value
                 - This is known as Comparison Operator
         */
        System.out.printf("Ans1: ");
        System.out.println("a - '=' is an unary operator which is used to assign vaule to a single operand or variable.\n" +
                "        - This is know as Assignment Operator");
        System.out.println("      b - '==' is a binary operator which compare the value of two operand or variable and returns a boolean value\n" +
                "        - This is known as Comparison Operator");

        /* Q2: byte b = 10; long l = 10l; → How much Byte will be used?
           Ans: byte b = 10; -> 1 byte in the memory is used for this variable
                long l = 10; -> 8 byte in the memory is used for this variable
                Total memory used for this two variable = 9 byte = 72 bits.
         */
        System.out.printf("Ans2: ");
        System.out.println("byte b = 10; -> 1 byte in the memory is used for this variable\n" +
                "      long l = 10; -> 8 byte in the memory is used for this variable\n" +
                "      Total memory used for this two variable = 9 byte = 72 bits.");
        /* Q3: Another byte b = 10; byte c = 10;  What is the output of b+c and what is the data type it will give in result?
           Ans: Output = 20, result datatype = int (byte + byte = int)
         */
        byte b = 10,c = 10;
        System.out.printf("Ans3: ");
        System.out.println("Result of b + c = "+(b+c));

        /* Q4: Find the output for the following:
               short s = 10;
               char c = 'A';
               int ss = s+c;
               System.out.println(ss);
           Ans: Output = 75
         */
        short s = 10;
        char ch = 'A';
        int ss = s+ch;
        System.out.printf("Ans4: ");
        System.out.println("Result of 10 + A = "+ss);

    }
}
