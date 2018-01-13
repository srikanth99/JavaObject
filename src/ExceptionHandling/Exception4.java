package ExceptionHandling;

import java.io.IOException;

/**
 * Created by User on 16/01/2016.
 */
public class Exception4 {
    void myMethod()throws IOException{
        throw new IOException();//checked exception
    }

    void anotheMethod() throws IOException {
        myMethod();
    }
    void newMethod() {
        try{
            anotheMethod();
        }catch(Exception e){
            System.out.println("exception handled");
        }
    }
    public static void main(String args[]){
        Exception4 obj=new Exception4();
        obj.newMethod();
        System.out.println("normal flow...");
    }
}
