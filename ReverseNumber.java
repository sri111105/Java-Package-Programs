import java.util.Scanner;
public class ReverseNumber {
    public static String rev(){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String reversed = new StringBuilder(a).reverse().toString();
        sc.close();
        return reversed;
    }
    public static void main(String[] args){
        String res=rev();
        System.out.println(res);
    }
 }
