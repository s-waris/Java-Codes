package thread.practice;

class Test extends Thread{
    @Override
    public void run(){
        int i=100;
        while(i-->0)
            System.out.println(i+"Hello");
    }
}

public class ThreadPractice {

    public static void main(String[] args) {
        Test tk = new Test();
        tk.start();
        int i=100;
        while(i-->0)
            System.out.println(i+"Sample");
    }
    
}
