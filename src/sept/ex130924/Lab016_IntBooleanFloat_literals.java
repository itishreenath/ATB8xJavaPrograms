package sept.ex130924;

public class Lab016_IntBooleanFloat_literals {

    public static void main(String[] args) {
        // Any constant value which can be assigned to the variable is called literal/constant.
        //1.Boolean literals
        boolean is_married = true;
        boolean is_married_amit = false;

        //2.Integral Literals - Decimal system(Base 10) - the allowed digits are 0-9.
        int age = 78;

        //2.Integral Literals - Binary Literal(Base 2) -always start from 0b and 0B ,the allowed digits are 0,1
        int binary_num  = 0b1010;

        //2.Integral Literals - Octal base(Base 8) - always start from 0 & the allowed digits are 0-7
        int octal = 0101; // 0101 = (0 × 8³) + (1 × 8²) + (0 × 8¹) + (1 × 8⁰) = 65

        //2.Integral Literals - Hexadecimal Literals(Base 16) - always start from 0x or 0X & the allowed digits are 0-9, and characters are a-f
        int hex = 0Xface; //base 16 color comination are in hex - #28a745

        //3.Float point Literals
        double d = 123.456;

    }
}
