import java.util.Arrays;
import java.util.Scanner;
public class Secondlarge {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter size of an array:");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Given array is :"+Arrays.toString(a));
        int largest=a[0],slargest=-1;
        for(int i=1;i<n;i++){
            if(a[i]>largest){
                slargest=largest;
                largest=a[i];
            }
            else if(a[i]<largest &&a[i]>slargest){
                slargest=a[i];
            }
        }
        System.out.println(slargest);
    }
}
