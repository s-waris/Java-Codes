package largest.element.of.array;

import java.util.*;

public class LargestElementOfArray {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array : ");
        int count = sc.nextInt();
        
        int A[]=new int[count];
        
        //initialising an array
        System.out.println("Enter the values of the array :");
        
        for(int i=0; i<count; i++)
            A[i]=sc.nextInt();
        
        //calculate the max
        int max=A[0];
        for(int i=0;i<A.length; i++){
            if(A[i]>max)
                max=A[i];
        }
        
        System.out.println("The maximum element of array is : "+max);
    }
}
