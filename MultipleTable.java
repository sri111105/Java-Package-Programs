
import java.util.*;

public class MultipleTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c= sc.nextInt();
        for(int i=1;i<=c;i++)
        {
            int b=a*i;
            System.out.println(a + "*" + i +"=" + b );       
     }

    }

}
