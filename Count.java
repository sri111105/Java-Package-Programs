import java.util.Scanner;
public class Count {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int factor=0;
        int count=0;
        for(int i=a;i<=b;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    factor++;
                    System.out.print(i);
                }
                
                if(factor==2)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
