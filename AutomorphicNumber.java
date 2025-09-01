import java.util.*;
public class AutomorphicNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a*a;
        int mod;
        if (b!=0){
            mod=b%10;
         
        if(mod==a%10)
        {
            System.out.println("this is automatric number");

        }
    
        else
        {
            System.out.println("not a aautomatric number");
        }

        }
    }

    
}
