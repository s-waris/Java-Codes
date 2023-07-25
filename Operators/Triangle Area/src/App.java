import java.util.*;
class App
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1 -> Calculate area using height");
        System.out.println("2 -> Calculate area using sides.");
        System.out.println("Enter Your Choice:");
        int choice=sc.nextInt();
        if (choice==1)
         {
            System.out.println("Enter the Base:");
            int base=sc.nextInt();
            System.out.println("Enter the Height:");
            int height=sc.nextInt();
            double area=1d/2d*base*height;
            if (area <= 0) 
                System.out.println("This is not a triangle");
            else 
                System.out.println("The area of triangle is:"+area);
        } 
        else if (choice==2)
        {
            System.out.println("Enter the Side 1:");
            int side1=sc.nextInt();
            System.out.println("Enter the Side 2:");
            int side2=sc.nextInt();
            System.out.println("Enter the Side 3:");
            int side3=sc.nextInt();
            if(side1+side2>side3 && side2+side3>side1 && side1+side3>side2)
            {
                double s=1d/2d*(side1+side2+side3);
                double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
                System.out.println("The area of triangle is:"+area);
            }
            else 
                System.out.println("This is not a triangle");
        }
        else
            System.out.println("Incorrect Choice.");
            sc.close();
    }
}
