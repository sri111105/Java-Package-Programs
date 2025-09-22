public class CheckReverse {
    public static boolean checkArray(int arr1[], int arr2[]) {
        if (arr1.length != arr2.length) return false;
        
        int ind = arr2.length - 1;
        for (int i : arr1) {
            if (i != arr2[ind]) return false;
            ind--;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {6, 5, 4, 3, 2, 1};
        
        boolean ans = checkArray(arr1, arr2);
        System.out.println( ans);
    }
}

