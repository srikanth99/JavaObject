package Arrays;

/**
 * Created by User on 18/12/2017.
 */
public class MDArray2 {
    public static void main(String[] args) {
        int a[][] = {{2,4}, {45,65,34}, {123,234,456,45}};
        for(int r=0;r<a.length;r++) {
            for(int c=0;c<a[r].length;c++) {
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }
    }
}
