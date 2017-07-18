package problem;

import java.util.Scanner;

/**
 * Created by fqlive on 2017/7/18.
 */
public class problem2 {
    public static  void main(String args[]){
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        for(int i=10000;i<99999;i++){
            int a=i%10;
            int b=i/10%10;
            int c=i/10/10%10;
            int d=i/10/10/10%10;
            int e=i/10000;
            if(a==e&&b==d&&a+b+c+d+e==n)System.out.println(i);
        }
        for(int i=100000;i<999999;i++){
            int a2=i%10;
            int b2=i/10%10;
            int c2=i/10/10%10;
            int d2=i/10/10/10%10;
            int e2=i/10000%10;
            int f2=i/100000;
            if(a2==f2&&b2==e2&&c2==d2&&a2+b2+c2+d2+e2+f2==n)System.out.println(i);
        }
    }
}
