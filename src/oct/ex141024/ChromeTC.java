package oct.ex141024;

public class ChromeTC extends BaseClass{
    @Override
    void openBrowser(String browser) {
        System.out.println("Open the Chrome");
    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("Close the Chrome");

    }
}
