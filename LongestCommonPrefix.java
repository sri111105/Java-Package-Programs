import java.util.Arrays;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] names={"bro","blow","but"};
        String ans="";
        Arrays.sort(names);
        String first=names[0];
        String last=names[names.length-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i)){
                ans+=first.charAt(i);
            }
            else{
                break;
            }
        }
        System.out.println(ans);
    }

}

    

