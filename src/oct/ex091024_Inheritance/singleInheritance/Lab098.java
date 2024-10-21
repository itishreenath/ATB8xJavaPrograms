package oct.ex091024_Inheritance.singleInheritance;

import oct.ex091024_Inheritance.singleInheritance.ex2.Python;
import oct.ex091024_Inheritance.singleInheritance.real.TestCase1;
import oct.ex091024_Inheritance.singleInheritance.real.TestCase2;

public class Lab098 {
    public static void main(String[] args) {
        Python obj = new Python();
        obj.print();

        TestCase1 obj1 =  new TestCase1();
        obj1.testCase();
        TestCase2 obj2 = new TestCase2();
        obj2.testCase();
    }
}
