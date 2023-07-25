package add.element.in.array;

import java.util.Scanner;

public class AddElementInArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the initial array : ");
        int count = sc.nextInt();
        
        int A[]=new int[count];
        
        //initialising an array
        System.out.println("Enter the values of the array :");
        
        for(int i=0; i<count; i++)
            A[i]=sc.nextInt();
        
        System.out.println("Enter the number of elements to be inserted : ");
        int add=sc.nextInt();
        
        //initialize a new array and copying the previous array
        int B[]=new int [count+add];
        for(int i=0; i<count; i++)
            B[i]=A[i];
        
        System.out.println("Enter the index where the element is to be inserted : ");
        int index=sc.nextInt();
        
        System.out.println("Enter the element which is to be inserted : ");
        int element=sc.nextInt();
        
        if(index<=A.length-1){
            for(int j=A.length-1;j>=index;j--){
                B[j+1]=B[j];
            }
        }
           
        B[index]= element;
        System.out.println("The New Array is");
        for(int x:B){
            System.out.print(x+", ");
        }
    }
    
}
