;public class Smllestelement {
    public static void main(String[]  args){
        
        int a[]={10,20,30,40,50};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            max= Math.min(max,a[i]);

        }
    System.out.println("largest number is" +max);
}
}
