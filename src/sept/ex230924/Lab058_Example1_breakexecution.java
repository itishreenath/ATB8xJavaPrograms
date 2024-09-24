package sept.ex230924;

public class Lab058_Example1_breakexecution {
    public static void main(String[] args) {
        // Switch Condition
        // Days - 1 to 7 ->  1 mon, 2 - tue, 7 - sun...
        int day = 3;
        switch (day) { //first search for the match then start executing the statements
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3: //it matches here, since there is no break statement it will all statements from here till it find break statement
                System.out.println("Wed");
            case 4:
                System.out.println("Thur");
            case 5:
                System.out.println("Friday");
                break; //execution stops here and comes out of the switch block
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No idea, what day its");
                break;
        }
        System.out.println("End of the loop");

    }
}
