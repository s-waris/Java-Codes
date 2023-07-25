package area;

import java.util.*;

public class Area {
    
    static double area(double l, double b){
        return(l*b);
    }
    
    static double area(double r){
        return(22/7*r*r);
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the dimensions : ");
        double l = sc.nextInt();
        double b = sc.nextInt();
        double r = sc.nextInt();
        System.out.println("Area of rectangle is : "+area(l, b));
        System.out.println("Area is circle is : "+area(r));
            
    }
    
    
}
