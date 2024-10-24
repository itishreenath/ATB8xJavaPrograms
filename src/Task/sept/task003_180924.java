package Task.sept;

public class task003_180924 {
    public static void main(String[] args) {
        /* Q1: Give some another example of Widening with Implicit and Explicit,
               Narrowing with implicit and explicit.
        */
        //Narrowing
        int ch1 = 97878;
        System.out.printf("Ans1: %d after explicit conversion = ",ch1);
        // char ch2 = ch1;  // Impicit type -> Invalid as it can't be converted by JVM
        char ch2 = (char)ch1; //Explicit type ->without any data loss
        System.out.println(ch2);
        //Widening
        char ch3 = '^';
        int ch4 = ch3; //Impicit type -> valid as it is converted by JVM
        System.out.printf("      %c after implicit conversion = ",ch3);
        System.out.println(ch4);
        ch4 = (int)ch3; //Explicit type
        System.out.printf("      %c after explicit conversion = ",ch3);
        System.out.println(ch4);

        /* Q2: Find the output of
               int a = 10;
               System.out.println(  --a + a --  + a--);
               System.out.println(a);
           Ans: Expression = --10 + 9-- + 8-- = 9 + 9 + 8 = 26
                a = --10 -> 9-- -> 8-- = 7
         */
        int a = 10;
        System.out.println("Ans2: The initial value of 'a' = "+a);
        System.out.printf("      The value of '--a + a -- + a--' = ");
        System.out.println(--a + a -- + a--);
        System.out.println("      The value of 'a' = "+a);

        /* Q3: Find the output of
               int b = 10;
               System.out.println(--b + b++ + b--);
               System.out.println(b);
           Ans: Expression = --10 + 9++ + 10-- = 9 + 9 + 10 = 28
                b = --10 -> 9++ -> 10-- = 9
         */
        int b = 10;
        System.out.println("Ans3: The initial value of 'b' = "+b);
        System.out.printf("      The value of '--b + b++ + b--' = ");
        System.out.println(--b + b++ + b--);
        System.out.println("      The value of 'b' = "+b);

        /* Q4: Find the output of
               int c = 10;
               System.out.println(c-- + c-- + c--);
               System.out.println(c);
           Ans: Expression = 10-- + 9-- + 8-- = 10 + 9 + 8 = 27
                c = 10-- -> 9-- -> 8-- = 7
         */
        int c = 10;
        System.out.println("Ans4: The initial value of 'c' = "+c);
        System.out.printf("      The value of 'c-- + c-- + c--' = ");
        System.out.println(c-- + c-- + c--);
        System.out.println("      The value of 'c' = "+c);

    }
}
