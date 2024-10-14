package Task;

public class task001_130924 {
    public static void main(String[] args) {
        /* Q1 - Write a program to print the table of number which user will give( int num 10)
           output will be like this (by using the printf() and println() )
           10 * 1 = 10
           10 * 2 = 20
           10 * 3 = 30….
           10 * 10 = 100
         */
        int num = 10;
        System.out.printf("Ans1: ");
        System.out.printf("%d * %d = %d",num,1,num*1);
        System.out.println();
        System.out.printf("%d * %d = %d",num,2,num*2);
        System.out.println();
        System.out.printf("%d * %d = %d",num,3,num*3);
        System.out.println();
        System.out.printf("%d * %d = %d",num,4,num*4);
        System.out.println();
        System.out.printf("%d * %d = %d",num,5,num*5);
        System.out.println();
        System.out.printf("%d * %d = %d",num,6,num*6);
        System.out.println();
        System.out.printf("%d * %d = %d",num,7,num*7);
        System.out.println();
        System.out.printf("%d * %d = %d",num,8,num*8);
        System.out.println();
        System.out.printf("%d * %d = %d",num,9,num*9);
        System.out.println();
        System.out.printf("%d * %d = %d",num,10,num*10);
        System.out.println();

        /* Q2 - Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
           double a = 34;
           double b = 10;
           Print - a+b, a-b, ab, a/b, a%b all the outputs.
         */
        double a = 34, b = 10;
        System.out.printf("Ans2: ");
        System.out.println("Addition result = "+(a+b));
        System.out.println("Subtraction result = "+(a-b));
        System.out.println("Multiplication result = "+(a*b));
        System.out.println("Division result = "+(a/b));
        System.out.println("Modulus result = "+(a%b));
    }
}
