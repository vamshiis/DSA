package maths;
import java.util.Scanner;
public class reverse {
        public static int reverse(int x) {
            int rev=0;
            while(x!=0){
                int last=x%10;
                // check for overflow for  32-bit integer range [-2^31, 2^31 - 1], then return 0.
                if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
                    return 0;
                }
                rev=(rev*10)+last;
                x=x/10;
            }
               return rev;
        }
      public static void main(String args[]){
               Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
      System.out.println(reverse(x));
       sc.close();
    
    }
}


