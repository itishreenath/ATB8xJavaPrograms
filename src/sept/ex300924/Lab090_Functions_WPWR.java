package sept.ex300924;

public class Lab090_Functions_WPWR {
    public static void main(String[] args) {
        // Calling With Parameters and With Return Type Function
        double result = function_type(3,423.8907); //passing arguments
        System.out.println("This is main()");
        System.out.println(result);
    }
    // 4. With Parameters and With Return Type
    static double function_type(int a, double b){
        System.out.println("This is With Parameters and With Return Type functions()");
        return a+b; //returns value
    }
}
