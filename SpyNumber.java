import java.util.*;
public class SpyNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int prod=1;
        while(a!=0){
            int mod=a%10;
            sum=sum+mod;
            prod=prod+sum;
            n=n/10;
        }
        if(sum==prod)
        {
            System.out.println("spy number");
        }
        else{
            System.out.println("not spy number");
        }
    }
    
}
