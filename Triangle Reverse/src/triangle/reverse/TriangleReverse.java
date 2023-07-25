package triangle.reverse;

import java.util.Scanner;

public class TriangleReverse {

    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of sides : ");
        int r = sc.nextInt();
        
        /* Triple Loop Code
        
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=i; j++)
                System.out.print(" ");
            
            for(int j=r; j>=i; j--)
                System.out.print("*");
            
            System.out.println("");
        }*/
        
        // Double Loop Code
        for(int i=1; i<=r; i++)
        {
            
            for(int j=1; j<=r; j++){
                if(i-j>0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println("");
        }

    }
    
}
