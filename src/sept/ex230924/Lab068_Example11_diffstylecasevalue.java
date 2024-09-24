package sept.ex230924;

import java.sql.SQLOutput;

public class Lab068_Example11_diffstylecasevalue {
    public static void main(String[] args) {
        char ch ='c';
        switch(ch){
            case 'a'+1:
                System.out.println("The character is 'b'.");
                break;
            case 'a':
                System.out.println("The character is 'a'.");
                break;
            case 'a'+2:
                System.out.println("The character is 'c'.");
                break;
        }
    }
}
