package problem;

/**
 * Created by fqlive on 2017/7/18.
 */
public class problem3 {
    public static void main(String args[]){
        for(int i=100;i<999;i++){
            int a=i%10;
            int b=i/10%10;
            int c=i/100;
            if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)==i)System.out.println(i);
        }
    }
}
