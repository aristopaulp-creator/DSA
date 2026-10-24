import java.util.Arrays;
import java.util.Vector;

public class mySort {
    public static void main(String[] args) {
        Vector<int[]> v = new Vector<>();

        v.add(new int[] {1, 20});
        v.add(new int[] {2, 30});
        v.add(new int[] {1, 10});

        for (int[] arr : v) {
            System.out.println(Arrays.toString(arr));
        }

        v.sort((a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } 
            else {
                return Integer.compare(a[1], b[1]);
            }
        });

        System.out.println();

        for (int[] arr : v) {
            System.out.println(Arrays.toString(arr));
        }
    }
    
}
