package bingo.pattern;

import java.util.Scanner;

public class BingoPattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int c = sc.nextInt();
        int a=1;
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=c; a++, j++)
            
                System.out.format("%02d ",a,"||");
            
            System.out.println("");
        }
    }
    
}
