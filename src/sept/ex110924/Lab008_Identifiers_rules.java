package sept.ex110924;

public class Lab008_Identifiers_rules {
    public static void main(String[] args) {
        // variable_name (Identifier) - Rules we have to follow
       /* 1. Identifier can contain Alphabets, Digits, and two special symbol i.e. Dollar ($), Underscore (_).
        * 2. First character of an identifier must be an Alphabet or Dollar ($) or Underscore (_).
        * 3. Keywords or Reserved words can't be used as Identifiers.
        */
   //     boolean 123 = true;     //not valid
        boolean $ = true;
        boolean _= true;
        boolean pramod_is_very_good_person = true;
   //     boolean 123pramod = true;     //not valid
        boolean pramod123 = true;
        boolean _123 = true;
        System.out.println(_123);
        boolean PRAMOD = true;
        boolean pramod$dutta = true;
        boolean pramod_dutta = true;
    }
}
