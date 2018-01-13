package conditionalStatments;

/**
 * Created by User on 04/09/2017.
 */
public class IfConditionDemo1 {
    public static void main(String[] args) {
        int age=10;
//        if(age>16)
//        System.out.println("You are eligible to vote");
//        System.out.println("You are not eligible to vote");
        int minBalance = 20;
        if(minBalance >= 2) {
            System.out.println("Gates opened");
        }
        System.out.println("you do not have enough balance, please top up");



    }
}
