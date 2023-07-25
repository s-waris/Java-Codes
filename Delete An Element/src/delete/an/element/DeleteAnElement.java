package delete.an.element;

import java.util.Scanner;

public class DeleteAnElement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the initial array : ");
        int count = sc.nextInt();
        
        int A[]=new int[count];
        
        //initialising an array
        System.out.println("Enter the values of the array :");
        
        for(int i=0; i<count; i++)
            A[i]=sc.nextInt();
        
        System.out.println("Enter the index of element to be deleted : ");
        int index = sc.nextInt();
        
        for(int j=index+1; j<A.length; j++){
                A[j-1]=A[j];
            }
        A[A.length-1]=0;
        
        System.out.println("The New Array is");
        for(int x:A)
            System.out.print(x+", ");
        
    }
    
}
