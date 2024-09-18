package sept.ex130924;

public class Lab017_CharStringNull_literals {
    public static void main(String[] args) {
        //4.Character literals - Single Quote
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';

        //4.Character literals as Integral literal
        char c4 = 97; //97
        System.out.println(c4);

        //4.Character literals - Unicode Representation(chinese,india,japense -> unicode): Unicode representation uxxxx.
     //   char c11  = '\u0041'; //'A' - 65 - ASCII


        //4.Character literals - Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("Itishree"+ new_line +  "Nath");
        // System.out.println("Itishree"+ '\n' +  "Nath");
        System.out.println("Itishree"+ tab_line +  "Nath");
        System.out.println("Itishree"+ back_space +  "Nath");
        System.out.println("Itishree"+ car_r +  "Nath");

        //5.String literal
        String name = "Itishree Nath";

        //6.Null Literal
        String empty = null;
    }
}
