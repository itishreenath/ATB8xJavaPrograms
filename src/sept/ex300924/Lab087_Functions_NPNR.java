package sept.ex300924;

public class Lab087_Functions_NPNR {
    // Functions()
    // Block of code which we can reuse.
    // 1. Pre-built - Math.max() - Java guys
    // 2. User created / defined


    // Two component of the functions
    // 1. Define
    // 2. Call the function

    // Parameter == Arguments
    // There are 4 types based on parameter and return type:-
    // 1.No Parameters and No Return Type - NPNR
    // 2.No Parameters but With Return Type - NPWR
    // 3.With Parameters and No Return Type - WPNR
    // 4. With Parameters and With Return Type - WPWR
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            greet(); // calling the function from main()
        }
    }

    // 1.No Parameters and No Return Type - NPNR
    public static void greet(){
        System.out.println("Hi");
    }
}
