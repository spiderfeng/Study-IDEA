package problem;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by fqlive on 2017/7/18.
 */
public class problem1 {
    public static  void main(String args[]){
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++)
            num[i]=cin.nextInt();
        Arrays.sort(num);
        for(int i:num)System.out.print(i+" ");
    }

}
