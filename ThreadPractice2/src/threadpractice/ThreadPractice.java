package threadpractice;

class seconds extends Thread{
    public seconds(String Name){
        super(Name);
    }
    public void run(){
        int a=0;
        while (a<100){
            System.out.println("Second : "+a++);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class decasec extends Thread{
    public decasec(String Name){
        super(Name);
    }
    public void run(){
        int a = 1;
        while(a<100){
            try{
                Thread.sleep(10000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Decasecond : "+a++);
        }
    }
}

public class ThreadPractice {

    public static void main(String[] args) {
        seconds sc = new seconds("SECOND");
        decasec dc = new decasec("DECASEC");
        sc.setDaemon(true);
        dc.setDaemon(true);
        dc.start();
        sc.start();
        Thread mainThread = Thread.currentThread();
        try {
            mainThread.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
