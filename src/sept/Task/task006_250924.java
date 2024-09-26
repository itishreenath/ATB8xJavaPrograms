package sept.Task;

import java.util.Scanner;

public class task006_250924 {
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

        /* Q2: WAP print factorial of a number that user will enter using For or while.
          Example - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
         */
        System.out.printf("Ans2: ");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = sc1.nextInt();
        System.out.printf("Factorial of %d: ",num);
        int factorial = 1;
        for(int i = num1; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);

        /* Q3: WAP print Prime Numbers from 1 to 100. (for loop)
         */
        System.out.printf("Ans3: ");
        System.out.println("Prime Numbers between 1 to 100 are: ");
        int c = 0;
        for(int i = 1; i <= 100 ; i++){
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    c++;
                }
            }
            if(c == 2){
                System.out.println(i);
            }
            c = 0;
        }

        /* Q4: WAP to enter your name and print the count of vowels and consonants in that String.
         */
        System.out.printf("Ans4: ");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc2.nextLine();
        int i = 0,cv = 0,cc = 0;
        while(i < name.length()){
           char letters = name.charAt(i);
           if(letters == 'a' || letters == 'e' || letters == 'i' || letters == 'o' || letters == 'u' || letters == 'A' || letters == 'E' || letters == 'I' || letters == 'O' || letters == 'U'){
               cv++;
           } else if(letters != ' ' ){
               cc++;
           }
           i++;
        }
        System.out.println("Number of Vowels in your name = " + cv);
        System.out.println("Number of Consonents in your name = " + cc);
    }
}
