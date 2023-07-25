package array.sum;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array : ");
        int count = sc.nextInt();
        int sum=0;
        int A[]=new int[count];
        System.out.println("Enter the values of the array :");
        for(int i=0; i<count; i++){
            A[i]=sc.nextInt();
            sum+=A[i];
        }
        
        System.out.println("The sum of all the elements in the array is : "+sum);
    }
    
}
