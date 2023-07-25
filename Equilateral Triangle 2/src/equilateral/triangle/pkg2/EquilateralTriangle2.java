package equilateral.triangle.pkg2;

import java.util.Scanner;

public class EquilateralTriangle2 {

    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of sides : ");
        int r = sc.nextInt();
        for(int i=1; i<=r; i++)
        {
            
            for(int j=r; j>i; j--)
                System.out.print(" ");
            
            for(int k=1; k<=i*2-1; k++){
                if (k%2!=0)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }  
            System.out.println("");
        }

    }
    
}
