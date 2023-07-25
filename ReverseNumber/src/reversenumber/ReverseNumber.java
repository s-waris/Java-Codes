package reversenumber;

import java.util.*;

public class ReverseNumber {
    
    static String Reverse(int n, String s){
        
        if(n==0)
            return s;
        s=s+(n%10);
        return Reverse(n/10,s);
        
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your Number : ");
        int n = sc.nextInt();
        
        System.out.println("The reverse of the number is : "+Reverse (n,""));
    }
    
}
