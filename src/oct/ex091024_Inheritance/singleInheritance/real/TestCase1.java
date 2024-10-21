package oct.ex091024_Inheritance.singleInheritance.real;

public class TestCase1  extends BaseTest {

    public TestCase1(){
       System.out.println("TestCase1 is executed");
   }
    public void testCase(){
        startBrowser();
        // Write code here FOR tTest case
        readExcelFile();
        closeBrowser();


    }
}
