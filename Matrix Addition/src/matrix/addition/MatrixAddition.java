package matrix.addition;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of rows/colums : ");
        int side = sc.nextInt();
        
        //accept the first matrix
        int A[][] = new int[side][side];
        System.out.println("Enter the first Matrix as prompted : ");
        for(int i=0; i<side; i++)
        {
            for(int j=0; j<side; j++){
                System.out.println("Enter the element "+i+","+j+" : ");
                A[i][j]=sc.nextInt();
            }
        }
        
        //accept the second matrix
        int B[][] = new int[side][side];
        System.out.println("Enter the second Matrix as prompted : ");
        for(int i=0; i<side; i++)
        {
            for(int j=0; j<side; j++){
                System.out.println("Enter the element "+i+","+j+" : ");
                B[i][j]=sc.nextInt();
            }
        }
        
        //addition of matrix
        int C[][]=new int [side][side];
        for(int i=0; i<side; i++)
        {
            for(int j=0; j<side; j++){
                C[i][j] = (A[i][j]+B[i][j]);
            }
        }
        
        //display the sum of matrices
        System.out.println("The Sum of the two matrices is : ");
        
        for(int x[] : C){
            for(int y : x){
                System.out.format("%03d, ",y);
            }
            System.out.println("");
        }
    }
    
}
