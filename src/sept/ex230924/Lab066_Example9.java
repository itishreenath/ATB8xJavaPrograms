package sept.ex230924;

public class Lab066_Example9 {
    public static void main(String[] args) {
        int a = 11; //here this variable is given just to confuse but has no role in the output
        switch (-1){ //valid scenario
            default:
                System.out.println("Default");
                break;
            case -1: //matches here and execute statements within this case block
                System.out.println("10");
                break;
            case 9:
                System.out.println("10");
                break;
        }
    }
}
