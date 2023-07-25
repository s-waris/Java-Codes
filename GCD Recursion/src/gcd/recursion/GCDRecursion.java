package gcd.recursion;

import java.util.*;

public class GCDRecursion {
    
    static int GCD(int n, int m){
        
        if(n==m)
            return n;
        if(n>m)
            n-=m;
        else
            m-=n;
        return (GCD(n,m));
    }
    
    /**static int GCD(int n, int m, int c){
        if(n==m)
            return n;
        else if((n/c)%m==0)
            return m;
        else if ((m/c)%n==0)
            return n;
        else
            return GCD(n,m,++c);
                
    }**/

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the numbers : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("The GCD is : "+GCD(n,m));
        //System.out.println("The GCD is : "+GCD(n,m,1));
    }
    
}
