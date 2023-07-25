package recursion.factorial;

import java.util.Scanner;

public class RecursionFactorial {
    
    static int fact(int n){
        if(n>1)
        {
            n=n*fact(n-1);
        }
      return n;   
    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Enter Your Number : ");
        int n = sc.nextInt();
        System.out.println("The Factorial is : "+fact(n));
    }
    
}
