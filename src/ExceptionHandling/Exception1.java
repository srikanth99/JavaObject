package ExceptionHandling;

/**
 * Created by User on 16/01/2016.
 */
public class Exception1 {
    public static void main(String args[]){
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
//            System.out.println(e.getMessage());
            System.out.println("task1 is completed");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("common task completed");
        }
        catch(Exception e){
            System.out.println("task 2 completed");
        }

        System.out.println("rest of the code...");
    }
}
