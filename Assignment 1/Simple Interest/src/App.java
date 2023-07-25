import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Principal Amount : ");
        int p=sc.nextInt();
        System.out.println("Enter the Interest Rate : ");
        int r=sc.nextInt();
        System.out.println("Enter the Duration of the Loan in Years : ");
        int t=sc.nextInt();
        System.out.println("The Interest for "+t+" years is : "+p*r*t/100);
        System.out.println("The Total Amount to be Paid Back : "+(p+p*r*t/100));
    }
}

