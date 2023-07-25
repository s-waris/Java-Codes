import java.util.*;
class App 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To calculate area, press 1.\nTo calculate volume press 2.");
        int choice = scanner.nextInt();
        if (choice == 1) 
        {
            System.out.println("Enter the Length:");
            float l = scanner.nextFloat();
            System.out.println("Enter the Breadth:");
            float b = scanner.nextFloat();
            System.out.println("Enter the Height:");
            float h = scanner.nextFloat();
            float area = 2*(l*b+l*h+b*h);
            System.out.println("The area of the cuboid is: "+area);
        } 
        else if (choice == 2)
        {
            System.out.println("Enter the Length:");
            float l = scanner.nextFloat();
            System.out.println("Enter the Breadth:");
            float b = scanner.nextFloat();
            System.out.println("Enter the Height:");
            float h = scanner.nextFloat();
            float volume = l*b*h;
            System.out.println("The area of the cuboid is: "+volume);
        }
        scanner.close();
    }
}