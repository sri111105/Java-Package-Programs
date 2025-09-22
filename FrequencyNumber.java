import java.util.*;
public class FrequencyNumber {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<=9;i++)
        {
            int temp=a;
            int count =0;
            while(temp!=0){
                int mod=temp%10;
                if(mod==i){
                    count++;
                }
                temp=temp/10;
            }
            if(count!=0){
                System.out.println(count);
            }
        }
        
sc.close();

     }
}
