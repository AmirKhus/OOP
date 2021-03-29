package Pr_1.Bidlo_Interf;

public class der_d {
    S s;
    Quackable quackable;
    Q q = new Q();


    public void s() {
        System.out.println("Утка плавает");
    }

    public void q() {
        q.quack();
    }

    public void f() {
        System.out.println("Утка летает");
    }
}
