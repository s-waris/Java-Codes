import java.util.*;
public class stringReverse 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        
        System.out.print("Enter the string to be reversed : ");
        String str=sc.nextLine();
        int i;
        String rev="";
        for (i=str.length()-1; i>=0; i--)
        {
            String s = Character.toString(str.charAt(i));
            rev = rev.concat(s);
        }
        System.out.println("The reversed string is : "+rev);
    }
 
}
