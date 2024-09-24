package sept.ex230924;

public class Lab070_ifelse_vowelconsonent {
    public static void main(String[] args) {
        // Vowel or consonant
        // vowel ->  a, e, i o, u
        char ch = 'p';
        if ( ch == 'a' || ch == 'e' || ch =='o' || ch == 'i' || ch == 'u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }

    }
}
