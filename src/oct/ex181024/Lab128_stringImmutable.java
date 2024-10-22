package oct.ex181024;

public class Lab128_stringImmutable {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str3 = "Hello";
        String str2 = str1.concat(" World");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
