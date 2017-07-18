package problem;

import java.util.Scanner;

/**
 * Created by fqlive on 2017/7/18.
 */
public class problem5 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = cin.nextInt();
        int b = cin.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == b) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("-1");
    }
}
