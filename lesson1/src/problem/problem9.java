package problem;

import java.util.Scanner;

/**
 * Created by fqlive on 2017/7/18.
 */
public class problem9 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int a[]=new int[15];
        int j=0;
        if(n==0) {
            System.out.println(0);
            return;
        }
        while(n!=0) {
            a[j++]=n%16;
            n=n/16;
        }
        for(int k=j-1;k>=0;k--) {
            if(a[k]>=10)System.out.print((char)('A'+a[k]-10));
            else System.out.print(a[k]);
        }
    }
}
