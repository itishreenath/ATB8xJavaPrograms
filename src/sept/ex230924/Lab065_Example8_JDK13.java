package sept.ex230924;

public class Lab065_Example8_JDK13 {
    public static void main(String[] args) {
        //After  JDK  version 13 in switch statement there is a different style of executing singe statements
        int itemCode = 001;
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }
    }
}
