package second.largest.of.array;

import java.util.Scanner;

public class SecondLargestOfArray {
 
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array : ");
        int count = sc.nextInt();
        
        int A[]=new int[count];
        
        //initialising an array
        System.out.println("Enter the values of the array :");
        
        for(int i=0; i<count; i++)
            A[i]=sc.nextInt();
        
        //find the second highest
        int max1=A[0], max2=A[0];
        for(int i=1; i<A.length; i++)
        {
            if(A[i]>max1){
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2)
                max2=A[i];
        }
        System.out.println("The Second Largest Element of the Array is : "+max2);
    }
    
}

