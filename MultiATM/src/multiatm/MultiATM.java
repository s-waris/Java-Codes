package multiatm;

class ATM{
    
    synchronized public void check(String name){
        System.out.println(name+" ");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("is checking the balance ");
    }
    
    synchronized public void withdraw(String name, int amount){
        System.out.println(name+" ");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("is withdrawing "+amount+"rupees");
    }
}

class Customer extends Thread{
    String name;
    int amt;
    ATM atm;
    
    Customer(String name, int amt, ATM atm){
        this.name = name;
        this.amt=amt;
        this.atm=atm;
    }
    void useATM(){
        atm.withdraw(name, amt);
        atm.check(name);
    }
    public void run(){
        useATM();
    }
}

public class MultiATM {

    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("SAAD",5000,atm);
        Customer c2 = new Customer("GABRU",10000,atm);
        c1.start();
        c2.start();
    }
    
}
