package recursive.fibonacci;

import java.util.*;

public class RecursiveFibonacci {
    
    static int Fibonacci(int n){
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        else 
            return(Fibonacci(n-2)+Fibonacci(n-1));
        
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Enter the sequence number :");
        int n = sc.nextInt();
        System.out.println("Fibonacci sequence is : " + Fibonacci(n));
        
    }
    
}
