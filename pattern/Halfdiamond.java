package pattern;
import java.util.*;
class Halfdiamond {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number");
        int n=in.nextInt();
        int start=1;
        for (int i=0;i<n;i++){
            if(i%2==0){
                start=1;
            }
            else{
                start=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }

    }
}