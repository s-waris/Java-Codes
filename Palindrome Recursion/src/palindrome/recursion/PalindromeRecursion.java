package palindrome.recursion;

import java.util.Scanner;

public class PalindromeRecursion {
    
    static int Reverse(int n, int temp){
        
        if(n==0)
            return temp;
        
        temp = temp*10+n%10;
        return Reverse(n/10,temp);
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        if(n==Reverse(n,0))
            System.out.println("It is a Palindrome number :");
        else
            System.out.println ("It is not a Palindrome number");
        
    }
    
}
