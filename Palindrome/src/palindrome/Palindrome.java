package palindrome;
import java.util.*;

public class Palindrome {
public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Enter a Number :");
        int n=sc.nextInt();
        int m=n;
        String rev="";

        for(; n>0; n/=10)
            rev=rev+(n%10);
        
        System.out.println("The Reverse of the Number is: "+rev);
        
        if(m==Integer.parseInt(rev))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
    
}
