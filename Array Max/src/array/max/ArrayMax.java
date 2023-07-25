package array.max;

import java.util.*;

public class ArrayMax {
    
    static void arrayinit (int A[], int size){
        
        Scanner sc = new Scanner (System.in);
        
        for(int i=0; i<size; i++){
            System.out.println("Enter the "+i+" value : ");
            A[i]=sc.nextInt();
        }
    }
    
    static int arrmax(int A[]){
        
        int max=A[0];
        
        for(int i=0; i<A.length; i++)
            max = A[i]>max ? A[i] : max;
        
        return max;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        
        int A[] = new int [size];
        arrayinit(A, size);
        System.out.println("The Maximum Value in the Array is : "+arrmax(A));
        
    }
}
