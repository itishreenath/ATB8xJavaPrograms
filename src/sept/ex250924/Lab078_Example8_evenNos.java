package sept.ex250924;

public class Lab078_Example8_evenNos {
    public static void main(String[] args) {
        // Print all the Even Numbers from 0 to 50
        for (int i = 0; i < 50 ; i++) {
            if(i == 35){
                break;
            }if(i == 20){
                continue;
            }if( i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
