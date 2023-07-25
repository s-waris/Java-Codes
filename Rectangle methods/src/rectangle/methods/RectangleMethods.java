package rectangle.methods;

import java.util.*;

 class RectangleMethods {
     
     public static void main(String[] args){
         
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter the length and breadth of the rectangle : ");
         int l=sc.nextInt();
         int b=sc.nextInt();
         RectangleComputation rm = new RectangleComputation();
         rm.getdimensions(l, b);
         System.out.println("Area : "+rm.area()+"\nPerimeter : "+rm.perimeter());
         
     }
     
}

 class RectangleComputation
 {
     private double l,b;
     
     public void getdimensions(double L, double B){
         l=L;
         b=B;
     }
     
     public double area(){
         return l*b;
     }
     
     public double perimeter(){
         return 2*(l+b);
     }
     
     public static void main(String[] args){
         
     }
 }

 

 
     

     
     