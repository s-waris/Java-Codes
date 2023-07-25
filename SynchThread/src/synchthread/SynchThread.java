package synchthread;

class dis{
    
    public void display(String s){
        synchronized(this){
        for(int i =0; i<s.length(); i++){
            System.out.print(s.charAt(i));
        }
    }}
}

class Th1 extends Thread{
    dis s;
    public Th1(dis a){
        s=a;
    }
    public void run(){
        s.display("HELLO WORD HOW ARE YOU");
    }
}

class Th2 extends Thread{
    dis s;
    public Th2(dis a){
        s=a;
    }
    public void run(){
        s.display("THIS IS A VERY BEAUTIFUL WORLD");
    }
}


public class SynchThread {

    public static void main(String[] args) {
        dis data = new dis(); 
        Th1 t1=new Th1(data);
        Th2 t2=new Th2(data);
        t1.start();
        t2.start();
    }
    
}
