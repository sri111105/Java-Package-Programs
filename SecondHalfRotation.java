import java.util.Arrays;

public class SecondHalfRotation {

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] rotateSecondHalfLeft(int arr[], int times) {
        int n = arr.length;
        int half = n / 2;

        int len = n - half;
        times = times % len; 
        System.out.println(times);
      
        reverse(arr, half, half + times - 1);  
        reverse(arr, half + times, n - 1);    
        reverse(arr, half, n - 1);           

        return arr;
    }

    public static void main(String[] args) {
        int times = 1;
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int ans[] = rotateSecondHalfLeft(arr, times);

        System.out.println(Arrays.toString(ans));
    }
}
