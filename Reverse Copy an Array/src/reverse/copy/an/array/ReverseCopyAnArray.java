package reverse.copy.an.array;

import java.util.Scanner;

public class ReverseCopyAnArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the initial array : ");
        int count = sc.nextInt();
        
        int A[]=new int[count];
        
        //initialising an array
        System.out.println("Enter the values of the array :");
        
        for(int i=0; i<count; i++)
            A[i]=sc.nextInt();
        
        int B[]=new int[count];
        for(int i=0; i<count; i++)
            B[i]=A[A.length-1-i];
        
        System.out.println("The New Array is");
        for(int x:B){
            System.out.print(x+", ");
        }
    }
    
}
