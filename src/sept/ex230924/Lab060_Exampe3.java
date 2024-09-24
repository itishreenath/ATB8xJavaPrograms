package sept.ex230924;

public class Lab060_Exampe3 {
    public static void main(String[] args) {
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge cases.

        String browser = "opera";
        switch (browser) {
            default:
                System.out.println("I have no idea which browser is this!!");
                break;
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;

        }
    }
}
