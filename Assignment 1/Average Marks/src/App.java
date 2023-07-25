import java.util.*;
public class App 
{
    public static void main(String[] args) throws Exception 
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String Name = sc.nextLine();
        System.out.println("Enter Your Address : ");
        String Address = sc.nextLine();
        System.out.println("Enter the Marks of Hindi, English and Maths : ");
        int Hindi = sc.nextInt();
        int English = sc.nextInt();
        int Maths = sc.nextInt();
        int Average = (Hindi+English+Maths)/3;
        System.out.println ("Name : "+Name+"\nAddress : "+Address);
        System.out.println("\n");
        System.out.println("Marks of the Subjects : ");
        System.out.println("Hindi: "+Hindi+"\nEnglish: "+English+"\nMaths: "+Maths);
        System.out.println("\n==========================\n");

        System.out.println("Average Marks : "+ Average);
    }
}
