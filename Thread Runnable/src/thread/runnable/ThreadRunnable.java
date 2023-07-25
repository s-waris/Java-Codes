package thread.runnable;

class Td implements Runnable{
    public void run(){
        int i=100;
        while(i-->0)
            System.out.println(i+" says Hello");
    }
}

public class ThreadRunnable {

    public static void main(String[] args) {
        
        Td t = new Td();
        Thread th = new Thread(t);
        th.start();
        int i=100;
        while(i-->0)
            System.out.println(i+" says  Ciao");
    }
    
}
