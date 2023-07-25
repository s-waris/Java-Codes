package right.rotation.array;

import java.util.Scanner;

public class RightRotationArray {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array : ");
        int count = sc.nextInt();
        
        int A[]=new int[count];
        
        //initialising an array
        System.out.println("Enter the values of the array :");
        
        for(int i=0; i<count; i++)
            A[i]=sc.nextInt();
        
        //right rotation
        System.out.println("Enter the number of times the rotation should occur : ");
        int rotation = sc.nextInt();
        
        for(int i=0;i<rotation;i++){
            int temp=A[A.length-1];
            for(int j=A.length-1;j>0;j--){
                A[j]=A[j-1];
            }
            A[0]=temp;
        }
        
        //printing the array using for each
        System.out.println("Array after Rotation is :");
        for(int x:A){
            System.out.print(x+", ");
        }
    
    }
    
}
