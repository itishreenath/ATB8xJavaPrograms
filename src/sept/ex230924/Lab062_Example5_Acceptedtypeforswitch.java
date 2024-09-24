package sept.ex230924;

public class Lab062_Example5_Acceptedtypeforswitch {
    public static void main(String[] args) {
        //Java switch expressions must be of byte, short, int, long(with its Wrapper type), enums and String.
        // Beginning with JDK7, it also works with enumerated types (Enums in java), the String class, and Wrapper classes.
        char ch = 'A'; // 65
        switch (ch) {
        }

//        boolean b = true;
//        switch (b) {
//      }

        long a11 = 30l;
        switch ((int) a11) {
        }
    }
}
