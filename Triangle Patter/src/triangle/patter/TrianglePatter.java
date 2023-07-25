package triangle.patter;

import java.util.Scanner;

public class TrianglePatter {

    public static void main(String[] args) {
        
        
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of sides : ");
        int r = sc.nextInt();
        
        for(int i=1; i<=r; i++)
        {
            
            for(int j=r; j>=1; j--){
                if(j-i>0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println("");
        }

    }
    
}
