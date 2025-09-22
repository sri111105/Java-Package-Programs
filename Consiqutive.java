
public class Consiqutive {

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 1, 1, 1, 1,1,1};
        int count = 0;
        int maxcount = 0;
        for (int i = 1; i < arr.length; i++) { 
                if (arr[i] == arr[i-1]) {
                    count++;
                    maxcount = Math.max(maxcount, count);

                } else {
                    count = 1;
                
            }
        }
        System.out.println("max_count=" + maxcount);
    }
}
