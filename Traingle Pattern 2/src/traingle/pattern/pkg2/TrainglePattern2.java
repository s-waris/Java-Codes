package traingle.pattern.pkg2;

import java.util.Scanner;

public class TrainglePattern2 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int c = sc.nextInt();
        
        for(int i=r; i>0; i--)
        {
            for(int j=1; j<=i; j++)
            
                System.out.print(j);
            
            System.out.println("");
        }
    }
    
}
