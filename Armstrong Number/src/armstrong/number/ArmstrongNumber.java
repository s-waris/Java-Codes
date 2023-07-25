package armstrong.number;

import java.util.*;
public class ArmstrongNumber {

    
    public static void main(String[] args) {
        
       Scanner sc=new Scanner (System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int m=n;
        int i,j=0;
        
        for(i=n; i>0; i/=10)
            j=(int)(j+(Math.pow(i%10,3)));
            
        if(j==m)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
        
    }
    
}
