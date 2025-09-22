import java.util.Arrays;

public class CheckRotation {
    public static int[] reverse(int a[], int start, int end) {
        while (start <= end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a;
    }
    public static int[] rotate(int a[], int k) {
        k = k % a.length;
        reverse(a, 0, a.length - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
        return a;
    }
    public static boolean isRotation(int[] a, int[] a2, int k) {
        int[] rotated = rotate(Arrays.copyOf(a, a.length), k);
        return Arrays.equals(rotated, a2);
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int a2[] = {4, 5, 1, 2, 3};
        int k = 2;

        System.out.println( Arrays.toString(rotate(Arrays.copyOf(a, a.length), k)));
        System.out.println( isRotation(a, a2, k));
    }
}
