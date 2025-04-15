package maths;
import java.util.Scanner;

public class countDigits {
    public static int countDigits(int n){
        int og=n;
        int count=0;
        while(n>0){
            int last=n%10;
           if(last!=0 && og%last==0){
            count+=1;
           }
            n=n/10;
        }
         return count;

    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      System.out.println(countDigits(n));
       sc.close();
    }
}
