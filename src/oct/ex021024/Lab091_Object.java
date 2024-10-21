package oct.ex021024;

import java.util.Scanner;

public class Lab091_Object {
    public static void main(String[] args) {
        // Object Class - OOps
        // String Class - Ref

        // Class -> Blueprint to create something
        // Objects - Instance of the class - created from the class.
        ATBStudent_Class amit = new ATBStudent_Class();
        amit.age  =35;

        ATBStudent_Class abhishek = new ATBStudent_Class();
        abhishek.age = 65;

        System.out.println(amit); // oct.ex021024.ATBStudent_Class@6acbcfc0
        System.out.println(abhishek); // oct.ex021024.ATBStudent_Class@5f184fc6

        // abhishek - Ref VARAIBLE - bYTE, ir bits ->  8, 64, null default
    }
}
