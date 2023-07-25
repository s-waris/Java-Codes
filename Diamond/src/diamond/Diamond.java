package diamond;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        int r=(rows+1)/2, s=rows-r;
        for(int i=1; i<=r; i++)
        {
            
            for(int j=r; j>i; j--)
                System.out.print(" ");
            
            for(int k=1; k<=i*2-1; k++)
                System.out.print("*");
                
            System.out.println("");
        }
        
        for(int i=s; i>=1; i--)
        {
            for(int k=s;k>=i;k--)
                System.out.print(" ");
            for(int j=1; j<i*2; j++)
                System.out.print("*");
                
            System.out.println("");
        }

    }
    
}
