package sept.ex300924;

public class Lab089_Functions_WPNR {
    // 3.With Parameters and Without Return Type
    public static void function_type( String name, String firstname, int age){
        System.out.println("This is With Parameters and No Return Type Function.");
        System.out.println("You have shared -> " + firstname + "." + name + ", and your age is " + age);
    }
    public static void main(String[] args) {
        //Calling With Parameters and No Return Type Function
        function_type("Itishree","Mrs",30);//passing agruments
    }
}
