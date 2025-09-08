import java.util.*;

public class PrimeNumberMethods {
    public static boolean prime() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int count = 0;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                count++;
                break; 
            }
        }

        if (count == 0 && a > 1) {
            System.out.println("PRIME NUMBER");
            return true;
        } else {
            System.out.println("NOT A PRIME NUMBER");
            return false;
        }
    }

    public static void main(String[] args) {
        boolean res = prime();
        System.out.println("Result = " + res); 
    }
}
