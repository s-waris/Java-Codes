import java.util.*;
public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temparature in degree Centigrade : ");
        double Centigrade = sc.nextDouble();
        System.out.println("Temparature in Fahrenheit : "+1.8*Centigrade+32);

    }
}
