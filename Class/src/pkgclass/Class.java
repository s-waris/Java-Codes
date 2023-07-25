package pkgclass;

class Whiteboard{
    int nStudents=0;
    String text;
    int count = 0;
    public void attendance(){
        nStudents++;
    }
    
    synchronized public void Write(String Text){
        System.out.println("The teacher wrote : " +Text);
        while(count!=0)
            try{wait();}catch(Exception e){System.out.println(e);}
        count = nStudents;
        text = Text;
        notifyAll();
    }
    
    synchronized public String Read(){
        while(count==0)
            try{wait();}catch(Exception e){System.out.println(e);}
        count--;
        if(count==0)
            notifyAll();
        return text;
      
    }
}

class Teacher extends Thread{
    Whiteboard wb;
    String s[] = {"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};
    
     Teacher(Whiteboard wb){
        this.wb=wb;
    }
     
    public void run(){
        for(int i=0; i<5;i++){
            wb.Write(s[i]);
        }
    }
}

class Student extends Thread{
    Whiteboard wb;
    String name;
    Student(String name, Whiteboard wb){
        this.wb=wb;
        this.name=name;
    }
    public void run(){
        wb.attendance();
        String st;
        do{
            st=wb.Read();
            System.out.println(name+" read "+st);
            System.out.flush();
        }
        while(!st.equals("end"));
    }  
}

public class Class {

    public static void main(String[] args) {
        Whiteboard wb=new Whiteboard();
        Teacher t = new Teacher(wb);
        Student s1 = new Student("Student 1",wb);
        Student s2 = new Student("Student 2",wb);
        Student s3 = new Student("Student 3",wb);
        Student s4 = new Student("Student 4",wb);
        Student s5 = new Student("Student 5",wb);
        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
    }
    
}
