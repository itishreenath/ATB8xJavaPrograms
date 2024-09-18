package sept.ex160924;

public class Lab024_Concatenation_QnA {
    public static void main(String[] args) {
        String first_name = "Itishree";
        String last_name = "Nath";
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b); // o/p -> ItishreeNath1010
        System.out.println(a + b + first_name + last_name); // o/p -> 20ItishreeNath
        //Q - what is the output of above two statement?
        /*A - In first case line 9,since string variable is used first followed by string and int values
         *so concatenation performed for the whole expression.
         *In second case line 10, since int variable is used first followed by int and string values
         *so addition of int vaues is done first then concatenation performed for the whole expression.
         */
        //In order to do the addition of teo int values at last we need to write as follows
        System.out.println(first_name + last_name + (a + b)); // o/p -> ItishreeNath20

    }
}
