import java.util.*;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the distance covered by the car in kms : ");
        double distance = sc.nextDouble();
        System.out.print("Enter the time taken by the car in hours : ");
        double time = sc.nextDouble();
        System.out.println("Speed of the Car is : "+distance/time+" km/hr");
    }
}
