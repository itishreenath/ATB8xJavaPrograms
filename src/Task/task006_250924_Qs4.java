package Task;

import java.util.Scanner;

public class task006_250924_Qs4 {
    public static void main(String[] args) {
        /* Q4: WAP to enter your name and print the count of vowels and consonants in that String.
         */
        System.out.printf("Ans4: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
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
