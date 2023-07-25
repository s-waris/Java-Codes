package matrix.multiplication.pkg2;

import java.util.Scanner;

public class MatrixMultiplication2 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        //accept the first matrix
        System.out.println("Enter the number of rows of the first matrix : ");
        int row1 = sc.nextInt();
        
        System.out.println("Enter the number of columns of the first matrix : ");
        int col1 = sc.nextInt();
        
        int A[][] = new int[row1][col1];
        System.out.println("Enter the first Matrix as prompted : ");
        for(int i=0; i<row1; i++)
        {
            for(int j=0; j<col1; j++){
                System.out.println("Enter the element "+i+","+j+" : ");
                A[i][j]=sc.nextInt();
            }
        }
        
        //accept the second matrix
        System.out.println("Enter the number of rows of the second matrix : ");
        int row2 = sc.nextInt();
        
        System.out.println("Enter the number of columns of the second matrix : ");
        int col2 = sc.nextInt();
        
        int B[][] = new int[row2][col2];
        System.out.println("Enter the second Matrix as prompted : ");
        for(int i=0; i<row2; i++)
        {
            for(int j=0; j<col2; j++){
                System.out.println("Enter the element "+i+","+j+" : ");
                B[i][j]=sc.nextInt();
            }
        }
        
        if(col1!=row2){
            System.out.println("The Matrix cannot be multiplied");
            System.exit(0);
        }
        //Multiplication of the matrices
        int C[][]=new int[row1][col2];
        
        for(int i=0; i<row1; i++)
        {
            for(int j=0; j<col2; j++){
                int sum=0;
                for(int k=0; k<row2 ; k++){
                    sum+=A[i][k]*B[k][j];
                }
                C[i][j]=sum;
            }
        }
        
        //display the results
        System.out.println("The resulting matrix is : ");
        
        for(int x[] : C){
            for(int y : x){
                System.out.format("%3d", y);
            }
            System.out.println("");
        }
        
    }
}
