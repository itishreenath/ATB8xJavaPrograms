package sept.ex300924;

public class Lab088_Functions_NPWR {
    public static void main(String[] args) {
        // Calling No Parameters but With Return Type Functions
        int age = function_type();
        System.out.println("This is main() where My age is "+age);
    }
    // 2.No Parameters but With Return Type
    public static int function_type() {
        System.out.println("This is No Parameters but With Return Type Function");
        return 30;//returns value
    }
}
