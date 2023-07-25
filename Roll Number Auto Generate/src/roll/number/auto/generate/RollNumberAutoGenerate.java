package roll.number.auto.generate;
import java.util.*;
class studentDetails{
    private String Roll,accNum,CID;
    private static int count=60001;
    
     studentDetails(){
        Date d = new Date();
        Roll = "BTECH/"+count+"/"+(d.getYear()-100);
        accNum="ACC"+(count-50000);
        CID=""+count;
    }
    void Display(){  
        System.out.println("The Roll Number is : "+Roll);
        System.out.println("The Account Number is : "+accNum);
        System.out.println("The Customer ID is : "+CID);
    }
}
public class RollNumberAutoGenerate {

    public static void main(String[] args) {
        studentDetails sd = new studentDetails();
        sd.Display();
    }
    
}
