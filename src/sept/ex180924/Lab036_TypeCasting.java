package sept.ex180924;

public class Lab036_TypeCasting {
    public static void main(String[] args) {
        //Type casting is used to change the type of a variable
        //can be done either Explicitly by user or Implicitly by JVM

        //1.Widening - can be done Implicit, Explicit way
        // there is no loss of data as data type size increases
        //Usually used when a lower datatype value is changed to a higher datatype vaule
        byte b = 10;
        int a = b; // Valid - Implicit Casting - JVM
        int a1 = (int)b; // Valid - Explicit Casting - JVM
        System.out.println(a1);

        //2.Narrowing - Implicit, Explicit(with using data type) -
        // there is loss of data as data type size decreases
        //Usually used when a higher datatype value is changed to a lower datatype vaule
        int val = 200;
        //byte b1 = val; // Invalid Implicit Casting - JVM
        byte b2 = (byte)val; // Invalid Explicit Casting - Loss of data.
        System.out.printf("The value of %d changed to %d ",val,b2);
        System.out.println();

        long phone_no = 9876543210l;
        //short s = phone_no; // Narrowing - Implicit - JVM // Invalid
        short s1 = (short)phone_no; // Narrowing - Explicit - Loss // Invalid
        System.out.printf("The value of %d changed to %d ",phone_no,s1);
    }
}
