package factorial;

import java.util.Scanner;

public class Factorial {
    // method to calculate factorial
    static int fact(int n){
        for(int i =n-1; i>1; i--)
        {
            n=n*i;
        }
        return n;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        
        System.out.println("The factorial is : "+fact(num));
    }
    
}
