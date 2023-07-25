package prime.number;

import java.util.Scanner;

public class PrimeNumber {
    
    /*
        Longer approach using no. of factors
    
    static boolean prime(int n){
        int c=0;
        for(int i=1; i<=n/2; i++){
            if(n%i==0)
                c++;
        }
        if(c<=1)
            return true;
        else 
            return false;
    }**/
        static boolean prime(int n){
        for(int i=2; i<n/2; i++){
            if(n%i==0)
                return false;
            }
            return true;
        
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number to be checked for prime : ");
        int num=sc.nextInt();
        if(prime (num))
            System.out.println("It is a prime number ");
        else
            System.out.println("It is not a prime number ");
    }
        
}        
