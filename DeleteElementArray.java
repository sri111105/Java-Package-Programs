import java.util.Arrays;
public class DeleteElementArray {
    public static void main(String[] args){
        int arr[]={10,20,30,40,50};
        int element=20;
        int newarr[]=new int[arr.length-1];
        for(int i=0,j=0;i<arr.length;i++){
            if(arr[i]==element){
                continue;
             }
            else{
                newarr[j]=arr[i];
                j++;

            }
            System.out.println(Arrays.toString(newarr));
            
        }
    }
  
}
