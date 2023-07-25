package reversal;

import java.util.*;

public class Reversal {
    
    static int reverse(int n){
        int rev=0;
        for(int i=n; i>0; i/=10)
            rev=rev*10+i%10;
        return rev;
    }
    
    static int[] reverse(int A[]){
        int REV[]=new int[A.length];
        for(int i=A.length-1; i>=0; i--)
            REV[A.length-i]=A[i];
        
        return REV;
    }

    public static void main(String[] args) {
       /** Scanner sc=new Scanner (System.in);
        System.out.println("Enter the dimensions : ");
        double l = sc.nextInt();**/
       
       System.out.println(reverse(8989));
       int X[]= {1,2,4,5,8,9};
       
       for(int x : X)
            System.out.print(x+", ");
            
    }
    
}
