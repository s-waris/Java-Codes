import java.util.*;
public class App 
{
    public static void main(String[] args) throws Exception 
    {   Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Cost Price : ");
        int Cost=sc.nextInt();
        System.out.println("\nEnter the Sell Price : ");
        int Sell=sc.nextInt();
        System.out.println("The profit earned is : "+(Sell-Cost));
    }
}
