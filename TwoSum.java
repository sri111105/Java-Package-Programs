    public class TwoSum {
    public static void main(String[] args){
        int n[]={1,2,3,4,5};
        int target=7;
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[j]==target-n[i]){
                    System.out.println(i +","+ j);
                    return;

                }
            }
        }
        System.out.println("nothing found");
    }
}
    
