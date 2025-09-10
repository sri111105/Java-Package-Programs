public class BinarySearchCall {
    
    public static void binary() {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 7;
        int left = 0, 
        right = arr.length - 1;

        while (left <= right) {
            int mid = left+(right-left) / 2;
            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        binary();
    }
}
