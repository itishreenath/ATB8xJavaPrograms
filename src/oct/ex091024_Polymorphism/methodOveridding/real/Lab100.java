package oct.ex091024_Polymorphism.methodOveridding.real;

public class Lab100 {
    public static void main(String[] args) {
//        Pramod p = new Pramod();
//        p.home();
//
//        Father f  = new Father();
//        f.home();
//

        // Dynamic Dispatch
        Father object = new Pramod();
        object.home();

        // WebDriver driver = new ChromeDriver();

        // Not possible
        // Pramod object = new Father();

    }
}
