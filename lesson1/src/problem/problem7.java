package problem;

import java.util.Scanner;

/**
 * Created by fqlive on 2017/7/18.
 */
public class problem7 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner cin=new Scanner(System.in);
        int m=cin.nextInt();
        int n=cin.nextInt();
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print((char)(Math.abs(j-i)+'A'));
            }
            System.out.println();
        }
    }
}
