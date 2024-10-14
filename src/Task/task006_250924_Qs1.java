package Task;

import java.util.Scanner;

public class task006_250924_Qs1 {
    public static void main(String[] args) {
        /* Q1: WAP print table of  number that user will enter using For or while.
         */
        System.out.printf("Ans1: ");
        Scanner sc = new Scanner(System.in); // New Object
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.printf("Multiplication Table of %d: ",num);
        System.out.println();
        for (int i = 1 ; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
}
