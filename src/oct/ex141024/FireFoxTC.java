package oct.ex141024;

public class FireFoxTC extends BaseClass{

    @Override
    void openBrowser(String browser) {
        System.out.println("Open the Firefox");
    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("Close the FireFox");

    }
}
