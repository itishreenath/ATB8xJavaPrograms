package oct.ex091024_Inheritance.singleInheritance.ex2;

public class Python extends Programming{
    // Python is A Programming
    public Python(){
        System.out.println("This is a Constructor!!The author and version of python language is displayed below:");
    }
    public void print(){
        System.out.println(author);
        System.out.println(version);
    }
}
