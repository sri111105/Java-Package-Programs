import java.util.Arrays;
public class ArraysAscendingorder {
    public static void main(String[] args){
    int a[]={10,30,60,80,50,20,100,70
    };
    for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
            if(a[i]>a[j]){
               int temp=a[i];
               a[i]=a[j];
               a[j]=temp;
            }
        }

    }
    System.out.println(Arrays.toString(a));
 } 
}
