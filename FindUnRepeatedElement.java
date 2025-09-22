
public class FindUnRepeatedElement {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean r = true;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    r = false;
                    break;
                }
            }
            if (r) {
                System.out.println("Unrepeated=" + arr[i]);
            }
        }
    }
}
