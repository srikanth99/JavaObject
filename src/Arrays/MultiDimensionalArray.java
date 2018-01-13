package Arrays;

/**
 * Created by User on 18/12/2017.
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int a[][] = {{2,4,6}, {45,65,34}, {123,234,456}};
        for(int r=0;r<3;r++) {
            for(int c=0;c<3;c++) {
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }
    }
}
