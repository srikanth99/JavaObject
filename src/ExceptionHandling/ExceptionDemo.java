package ExceptionHandling;

/**
 * Created by User on 20/08/2017.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
      ExceptionDemo ed = new ExceptionDemo();
        double a[]= new double[5];
        a[5]=ed.div(23, 9);
        System.out.println(a[4]);
        System.out.println(a[4]);
        System.out.println(a[4]);
        System.out.println(a[4]);
        System.out.println(a[4]);
        System.out.println(a[4]);
    }

    public double div(int a, int b) {
        double c=a/b;
        return c;
    }
}
