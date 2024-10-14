package Task;

public class task004_200924 {
    public static void main(String[] args) {
        /*Q1: By using Ternary Operators max between 3 numbers.
              Input int - a,b,c - a = 10, b = 20, c = 45
              Max → a,b,c → c
         */
        int a = 10, b = 20, c = 45;
        System.out.printf("Ans1: ");
        int max = (a >= b && a >= c)? a : ((b >= c && b >= a)? b : c ) ;
        System.out.printf("Maximum number in %d, %d and %d is %d.",a,b,c,max);
        System.out.println();
        /*Q2: Ternary Operators to handle multiple conditions.
              Input → int score = 85
              String grade → ?
              score >= 90 → A
              score >= 80 → B
              score >= 70 → C
         */
        int score = 85;
        System.out.printf("Ans2: ");
        String grade = (score >=90)? "A" : ((score >=80)? "B" : "C");
        System.out.printf("Your grade is %s.",grade);
        System.out.println();
        /* Q3: Triangle Classifier ( If) - Write a program that classifies a triangle based on its side lengths.
               Given three input values representing the lengths of the sides as side1, side2, side3
               determine if the triangle is equilateral (all sides are equal),
               isosceles (exactly two sides are equal), or
               scalene (no sides are equal).
               Use an if-else statement to classify the triangle.
         */
        int side1 = 10 , side2 = 20 , side3 = 10;
        System.out.printf("Ans3: ");
        if(side1 == side2 && side2 == side3){
            System.out.println("This is an Equivalence triangle");
        } else if (side1 == side2 || side2 == side3 || side3 == side1){
            System.out.println("This is an Isosceles triangle");
        } else {
            System.out.println("This is an Scalene triangle");
        }
        /* Q4: Write a program that prints numbers from 1 to 100.
               However, for multiples of 3, print "Fizz" instead of the number,
               and for multiples of 5, print "Buzz."
               For numbers that are multiples of both 3 and 5, print "FizzBuzz."
         */
        System.out.printf("Ans4: ");
        for(int i = 1 ; i <= 100 ; i++){
            if (i % 3 == 0 && i % 5 ==0) {
                System.out.println("      FizzBuzz.");
            } else if (i % 5 == 0) {
                System.out.println("      Buzz.");
            } else if(i % 3 == 0){
                System.out.println("      Fizz");
            } else {
                if(i == 1){
                    System.out.println(i);
                    continue;
                }
                System.out.println("      "+i);
            }
        }
        /* Q5: Write a program to find whether the year is a leap year or not.Find for input 2024.
         */
        int year = 2024;
        System.out.printf("Ans5: ");
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )){
            System.out.printf("%d is a leap year.",year);
        } else {
            System.out.printf("%d is not a leap year.",year);
        }
    }
}
