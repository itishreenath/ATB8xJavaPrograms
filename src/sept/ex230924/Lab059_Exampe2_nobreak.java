package sept.ex230924;

public class Lab059_Exampe2_nobreak {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Mon");
            case 2: //it matches here and start executing all the statements since no break is present
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4: //it matches here and start executing all the statements inside and outside the block since no break is present
                System.out.println("Thur");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("No idea, what day its");
        }
        System.out.println("End of the loop");

    }
}
