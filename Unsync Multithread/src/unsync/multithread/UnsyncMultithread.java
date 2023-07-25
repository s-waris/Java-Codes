package unsync.multithread;

class dis{
    String Word;
    dis(String s){
        Word = s;
    }
    public void display(){
        for(int i =0; i<Word.length(); i++){
            System.out.print(Word.charAt(i));
        }
    }
}

class Th1 extends Thread{
    String s;
    Th1(String a){
        s=a;
    }
    public void run(){
        dis d = new dis(s);
        d.display();
    }
}

class Th2 extends Thread{
    String s;
    Th2(String a){
        s=a;
    }
    public void run(){
        dis d = new dis(s);
        d.display();
    }
}

public class UnsyncMultithread {

    public static void main(String[] args) {
        
        Th1 t1=new Th1("Hello");
        Th2 t2=new Th2("World");
        t1.start();
        t2.start();
    }
    
}
