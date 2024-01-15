package StartWisePath.Level1to2;

import java.util.Scanner;

public class TheTwoDishes {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        int a,b;
        for (int i=0;i<t;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            for (int j=0;j<=a;j++){
                if (b - j <= a) {
                    System.out.println(b-j-j);
                    break;
                }
            }
        }
    }
}
