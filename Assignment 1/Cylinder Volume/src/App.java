import java.util.*;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Radius of the Cylinder : ");
        int Radius = sc.nextInt();
        System.out.println("Enter the Height of the Cylinder : ");
        int Height = sc.nextInt();
        System.out.println("Volume of the Cylinder : "+Math.PI*Math.pow(Radius, 2)*Height);
    }
}
