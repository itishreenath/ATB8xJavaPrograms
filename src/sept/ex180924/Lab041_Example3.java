package sept.ex180924;

public class Lab041_Example3 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a-- + --a);
        System.out.println(a);
        // A -> a-- -> 10 , a= 9
        // + -> operator
        // B -> --a  -> 8 , a= 8

        // Line no | a  |  Exp
        // 5   | 10 | NA
        // 6  | 8 | 10 + 8
    }
}
