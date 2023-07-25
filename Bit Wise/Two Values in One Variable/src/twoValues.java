import java.util.*;
public class twoValues 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the first value: ");
        int a=sc.nextInt();
        System.out.print("Enter the second value: ");
        int b=sc.nextInt();
        byte c= (byte)(a<<4);
        c|=b;
        System.out.println("The Variable has the value : "+c);
        System.out.println("The First Value is : " +((c&0b11110000)>>4));
        System.out.println("The Second Value is : " +(c&(0b00001111)));
    }
}