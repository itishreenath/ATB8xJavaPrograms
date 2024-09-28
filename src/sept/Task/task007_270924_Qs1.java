package sept.Task;

import java.util.Scanner;

public class task007_270924_Qs1 {
    public static void main(String[] args) {
        /* Q1: Give me example of while vs do while loop in Lab ex.
         */
        /* I have taken example of palindrome number(reverse of number is equal to original number) using while loop
         */
        System.out.println("Ans1: Display whether the number is Palindrome or not using while loop.");
        Scanner sc = new Scanner(System.in); // New Object
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println();
        int n = num, revn = 0, l;
        while (n != 0) {
            l = n % 10;
            revn = revn * 10 + l;
            n /= 10;
        }
        if (revn == num) {
            System.out.println("This is a Palindrome Number");
        } else {
            System.out.println("This is not a Palindrome Number");
        }
        /* I have taken example as printing the name atleast once when condition is false using do-while loop
         */
        System.out.println("Ans1: Print the name atleast once when condition is false using do-while loop.");
        int a = 5;
        do {
            System.out.println("Hello world!! This is Itishree want to tell that the condition will never be true here.");
        } while (a > 5);
    }
}
