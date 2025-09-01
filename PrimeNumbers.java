import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        for(int i = 2; i < a; i++){
            if(a % i == 0){
                count++;
                break; 
            }
        }

        if(count == 0 && a > 1){
            System.out.println("PRIME NUMBER");
        } else {
            System.out.println("NOT A PRIME NUMBER");
        }

        sc.close();
    }
}
