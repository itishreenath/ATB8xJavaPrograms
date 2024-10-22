package oct.ex181024;

public class Lab131 {
}

class Super {

    private int a;

    protected Super(int a) {
        this.a = a;
    }
    Super(){

    }

}

class Sub extends Super {

    public Sub(int a) {
        super(a);
    }

    public Sub() {
        super();
    }

}
