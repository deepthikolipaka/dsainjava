import java.util.*;
public class Input{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=in.nextInt();
        //array of non primitives
        String []s=new String[n];
        for(int i=0;i<s.length;i++){
            System.out.println("Enter elements "+i);
            s[i]=in.nextLine();
            System.out.println(s[i]);
        }
        System.out.println(Arrays.toString(s));
    }
}