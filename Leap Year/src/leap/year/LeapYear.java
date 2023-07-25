package leap.year;

import java.util.Scanner;

public class LeapYear {
    
    static boolean leapyear(int year){
        if (year % 4 == 0 && year % 100!= 0) 
            return true;
        else if (year % 400 == 0) 
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        if(leapyear(year))
            System.out.println("It is a leap year");
        else
            System.out.println("It's not a leap year");
    }
}
