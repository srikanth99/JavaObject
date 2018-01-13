package Abstraction;

/**
 * Created by User on 09/04/2017.
 */
public class MyCalc extends Calc1 {
    static MyInterface m1;
    static Calc1 m2;
    static MyCalc m3;

    public void sub(int a, int b) {
        int c = a-b;
        System.out.println(c);
    }

    public void div(int a, int b) {
        int c = a/b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        m1 = new MyCalc();
        m2 = new MyCalc();
        m3 = new MyCalc();


    }
}
