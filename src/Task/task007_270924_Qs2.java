package Task;

public class task007_270924_Qs2 {
    public static void main(String[] args) {
        /* Q1: Create a Java program that prints the first 5 even numbers using a do-while loop.
         */
        System.out.println("Ans2: The first 5 even numbers are :");
        int num = 1;
        do {
            if(num % 2 == 0){
                System.out.println(num);
            }
            num++;
        } while(num < 11);

    }
}
