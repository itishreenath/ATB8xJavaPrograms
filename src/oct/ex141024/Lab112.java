package oct.ex141024;

public class Lab112 {
    public static void main(String[] args) {
        System.out.println("Itishree");

        P p  = new P();
        p.f1();
        System.out.println("Nath");
        //I i = new I();
    }
}

class P implements I{

    @Override
    public void f1() {
        System.out.println("Created P");
    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}

interface I{
    void f1();
    void f2();
    void f3();
}