package sept.ex200924;

public class Lab050_IfElseStatement {
    public static void main(String[] args) {
        /*Conditional Statement are used to check condition and perform different actions based on different decisions.
          1.Use if to specify a block of code to be executed, if a specified condition is true
          2.Use else to specify a block of code to be executed, if the same condition is false
          3.Use else if to specify a new condition to test, if the first condition is false
          4.Use switch to specify many alternative blocks of code to be executed
          Syn: if(Condition){
                  true statements;
               } else if(new condition){
                   true statements;
               } else{
                    false statements;
               }
        */
        int age = 12;
        if (age > 18) {
            System.out.println("Allowed to Vote!!");
        } else {
            System.out.println("Not Allowed!");
        }

    }
}
