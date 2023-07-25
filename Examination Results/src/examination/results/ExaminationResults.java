package examination.results;

import java.util.*;

class ExamOperations {
    Scanner sc=new Scanner (System.in);
    
    String name,SUID, status;
    int m1,m2,m3,m4,m5,m6,total,average;
    double percentage;
    
    void setdetails(){
        name = "";
        SUID="";
        m1=m2=m3=m4=m5=m6=0;
    }
    
    void calculate(){
        total = m1+m2+m3+m4+m5+m6;
        average = total/6;
        percentage = total/600*100;
        if(percentage>40)
            status = "pass";
        else
            status = "fail";
    }
    
    public String toString(){
        setdetails();
        calculate();
        return("Total Marks : "+total+"      Percentage : "+percentage+"      Status : "+status);
    }
}
public class ExaminationResults {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ExamOperations eo=new ExamOperations();
        System.out.println(eo);
        
        }
    }
    

