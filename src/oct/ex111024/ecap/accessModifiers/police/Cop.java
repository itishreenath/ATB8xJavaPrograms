package oct.ex111024.ecap.accessModifiers.police;

public class Cop {
    public int gun;
    private String idCard;

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes, You can!!");
    }
}
