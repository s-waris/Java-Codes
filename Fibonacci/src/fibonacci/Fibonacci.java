16package fibonacci;
import java.util.*;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=0,b=1;
        System.out.print("Enter the number of Fibonacci Series terms required: ");
        int term = sc.nextInt();
        if(term==1)
            System.out.println("\n"+a);
        if(term==2)
            System.out.println("\n"+a+", "+b);
        if(term>2)
        {           
            System.out.print("\n"+a+", "+b+", ");
            for(int i=2;i<term; b=a+b, a=b-a, i++)
                System.out.print(a+b+", ");
        }
        System.out.println("");
    }
}
