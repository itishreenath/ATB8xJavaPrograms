package oct.ex141024;

public class Lab111 {
    public static void main(String[] args) {

        ChromeTC c  = new ChromeTC();
        c.openBrowser("chrome");
        c.closeBrowser("chrome");
        c.takeScreenshot();
        c.NoBodyKnowsWhereIamPresent();

        FireFoxTC firefoxtc = new FireFoxTC();
        firefoxtc.openBrowser("FIREFOX");
        firefoxtc.closeBrowser("FIREFOX");


    }
}
