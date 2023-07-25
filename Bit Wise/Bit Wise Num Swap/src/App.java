import java.util.*;
public class App 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the value of a : ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b=sc.nextInt();
        a^=b;
        b=a^b;
        a^=b;
        System.out.printf("The value of a=%d and the value of b=%d \n", a,b);
    }
    
}
