package sept.ex250924;

import java.util.Scanner;

public class Lab084_InputFromUser {
    public static void main(String[] args) {
        // How to take a use input
        Scanner sc = new Scanner(System.in); // New Object
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("Enter the String");

        String name = sc.nextLine();
        System.out.println(name);
    }
}
