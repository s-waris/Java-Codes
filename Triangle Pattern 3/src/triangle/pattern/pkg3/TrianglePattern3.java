package triangle.pattern.pkg3;

import java.util.Scanner;

public class TrianglePattern3 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of sides : ");
        int r = sc.nextInt();
        
        for(int i=1; i<=r; i++)
        {
            for(int j=r; j>=i; j--)
            
                System.out.print(j);
            
            System.out.println("");
        }
    }
    
}
