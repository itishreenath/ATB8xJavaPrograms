package Task;

public class task006_250924_Qs3 {
    public static void main(String[] args) {
        /* Q3: WAP print Prime Numbers from 1 to 100. (for loop)
         */
        System.out.printf("Ans3: ");
        System.out.println("Prime Numbers between 1 to 100 are: ");
        int c = 0;
        for(int i = 1; i <= 100 ; i++){
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    c++;
                }
            }
            if(c == 2){
                System.out.println(i);
            }
            c = 0;
        }
    }
}
