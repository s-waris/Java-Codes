import java.util.*;
public class App
{
    public static void main(String args[]) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first co-efficient: ");
        int a= sc.nextInt();
        System.out.println("Enter the second co-efficient: ");
        int b= sc.nextInt();
        System.out.println("Enter the constant: ");
        int c= sc.nextInt();
        double r= Math.sqrt(Math.pow(b, 2)-(4*a*c));
        if (Math.pow(b, 2)-(4*a*c)<0) 
        {
            System.out.println("Imaginary Roots");
            System.exit(0);
        }
        else
        {
            double root1= (-b+r)/2*a;
            double root2= (-b-r)/2*a;
            System.out.println("The first root is: "+root1);
            System.out.println("The second root is: "+root2);
        }
        sc.close();
    }
}