package Task;

import java.util.Scanner;

public class task006_250924_Qs2 {
    public static void main(String[] args) {
        /* Q2: WAP print factorial of a number that user will enter using For or while.
          Example - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
         */
        System.out.printf("Ans2: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.printf("Factorial of %d: ",num);
        int factorial = 1;
        for(int i = num; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
