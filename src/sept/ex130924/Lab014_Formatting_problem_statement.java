package sept.ex130924;

public class Lab014_Formatting_problem_statement {
    public static void main(String[] args) {
        // Problem statement - print the table of 2
        // Formatting
        // %d - any integer,byte, short, long
        // %s - String
        // %c - char
        // %f -> float, double
        int num = 10;
        System.out.printf("Value of %d",num);
        System.out.println("2x1=2");
        System.out.printf("%d * %d = %d",num,1,num*1);
        System.out.println();
        System.out.printf("%d * %d = %d",num,2,num*2);

    }
}
