package Task.sept;

public class task007_270924_Qs3 {
    public static void main(String[] args) {
        /* Q1: Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.
         */
        System.out.println("Ans3: Display sum of number from 1 - 100.");
        int n = 1, sum = 0;
        while(n <= 100){
            sum = sum + n;
            n++;
        }
        System.out.println("1 + 2 + 3 + 4 + 5 + 6 +...........+ 100 = " + sum);
    }
}
