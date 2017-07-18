package problem;

import java.util.Scanner;

/**
 * Created by fqlive on 2017/7/18.
 */
public class problem10 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        String a[]=new String[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=cin.next();
            int s = 0,aa=0,k=0;
            int wei[]=new int[30];
            for(int j=0;j<a[i].length();j++) {
                char c=a[i].charAt(j);
                if(c>='A'&&c<='F') aa=c-'A'+10;
                else aa=c-'0'+0;
                s+=aa*Math.pow(16, a[i].length()-1-j);
            }
            while(s!=0) {
                wei[k++]=s%2;
                s=s/2;
            }
            int a1=k/3;
            int b1=k%3;
            for(int i1=0;i1<a1;i1++) {
                int c1=(int) (wei[k-1-i1*3]*Math.pow(2, 2)+wei[k-2-i1*3]*Math.pow(2, 1)+wei[k-3-i1*3]*Math.pow(2,0));
                b[i]+=c1*Math.pow(10, a1-1-i1);
            }
            for(int i2=k-1-a1*3;i2>=0;i2--)b[i]+=wei[k-a1*3-1]*Math.pow(2,b1-1-i2);
        }
        for(int kk=0;kk<n;kk++)System.out.println(b[kk]);
    }

}
