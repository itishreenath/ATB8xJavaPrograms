package Task.sept;

public class task005_230424 {
    public static void main(String[] args) {
        /* Q1: Create a simple calculator that performs addition, subtraction, multiplication, division, modulus
        based on user input using switch statements.
        Inputs :   num 1, num 2, +
        Output :  num1+num2 → print information.
         */
        int num1 = 10, num2 = 25;
        char operator = '+';
        System.out.printf("Ans1: ");
        switch(operator){
            case '+' -> System.out.printf("%d + %d = %d",num1,num2,num1+num2);
            case '-' -> System.out.printf("%d - %d = %d",num1,num2,num1-num2);
            case '*' -> System.out.printf("%d * %d = %d",num1,num2,num1*num2);
            case '/' -> System.out.printf("%d / %d = %d",num1,num2,num1/num2);
            case '%' -> System.out.printf("%d % %d = %d",num1,num2,num1%num2);
            default -> System.out.printf("This is not a valid operator");
        }
        System.out.println();
        /* Q2: Write a program that takes an integer input (1-12) and
           prints the name of the corresponding month using a switch statement.
           Input  - 12
           Output - Dec.
         */
        int month = 12;
        System.out.printf("Ans2: ");
        switch(month){
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Not a valid month");
        }
        /* Q3: Write a program that converts between different units
           (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
           choice - 1 - km → m,
           choice - 2 - f → c,
         */
        System.out.printf("Ans3: ");
        int km = 25;
        double F = 99;
        String choice = "F -> C";
        System.out.printf("The choice is %s",choice);
        switch(choice){
            case "km -> m":
                int m = km * 1000;
                System.out.println("\n      After conversion from km -> m, value = "+m);
                break;
            case "F -> C":
                double C = (F - 32) * 5/9;
                System.out.println("\n      After conversion from °F -> °C, value = "+C);
                break;
            default :
                System.out.println("Not a valid choice");
                break;
        }
    }
}
