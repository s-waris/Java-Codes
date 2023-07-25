package gcd.of.two.numbers;

import java.util.*;

public class GCDOfTwoNumbers {
    
    static int GCD(int n, int m){
        int GCD=0;
        for(int i=1; i<=Math.max(n,m); i++){
            if(n%i==0 && m%i==0)
                GCD = i; 
        }
        return GCD;
    }
    
    /**
    static int GCD(int n, int m){
        int GCD = m;
        while(m!=n)
        {
            if(m>n)
                m=m-n;
            else
                n=n-m;
        }
        GCD = m;
        return GCD;
    }**/
    


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        
        System.out.println("The Greatest Common Divisor is : "+GCD(num1,num2));
    }
    
}