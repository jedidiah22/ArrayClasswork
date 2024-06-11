import java.util.Arrays;

public class Rotate {

    public static int[] rotLeft(int[] a, int d) {
        int n = a.length;
      
        d = d % n;

        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            int newPosition = (i + n - d) % n;
            rotatedArray[newPosition] = a[i];
        }

        return rotatedArray;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int d = 4;

        int[] result = rotLeft(a, d);
        System.out.println(Arrays.toString(result));
    }
}
