package problem;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by fqlive on 2017/7/18.
 */
public class problem6 {
    public static void main(String args[]){
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=cin.nextInt();
            sum+=a[i];
        }
        Arrays.sort(a);
        System.out.println(a[n-1]);
        System.out.println(a[0]);
        System.out.println(sum);
    }
}
