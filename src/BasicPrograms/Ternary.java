package BasicPrograms;

public class Ternary {
    public static void main(String[] args){
        int x=20, y=10;
        // (Condition)? executeThisPortionIfTrue:executeThisPortionIfFalse
        int result = (x>10) ? y : x;
        System.out.println("result " + result);

    }

}
