package equilateral.triangle;

import java.util.Scanner;

public class EquilateralTriangle {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of columns : ");
        int r = sc.nextInt();
        int c=r;
        /*for(int i=1; i<=r; i++)
        {
            
            for(int j=r; j>i; j--)
                System.out.print(" ");
            
            for(int k=1; k<=i*2-1; k++)
                System.out.print("*");
                
            System.out.println("");*/
        
        for(int i=r; i>=1; c++,i--)
        {
            for(int j=1; j<=c; j++)
                if(i-j>0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            System.out.println("");
        
        }

    }
    
}
