package pattern;
import java.util.Scanner;
class Rtri{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter how many rows do you want?");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}