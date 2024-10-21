package oct.ex091024_Inheritance.singleInheritance.real;

public class TestCase2  extends BaseTest {
    public TestCase2(){
        System.out.println("TestCase2 is executed");
    }
    public void testCase(){
        startBrowser();
        // Write code here FOR tTest case
        readExcelFile();
        closeBrowser();
    }
}
