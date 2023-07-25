package shop.member;

interface Member{
    void callback();
}

class Store{
    Member m[]=new Member[100];
    int c=0;
    
    void register(Member m){
        this.m[c++]=m;
    }
    
    void sale (){
        for(int i=0; i<c; i++){
            m[i].callback();
        }
    }
}

class Customer implements Member{
    String name;
    Customer(String name){
        this.name = name;
    }
    @Override
    public void callback(){
        System.out.println("Mr."+name+", It's SALE !!!");
    }
}

public class ShopMember {

    public static void main(String[] args) {
        Store s=new Store();
        Customer c1=new Customer("Saad");
        s.register(c1);
        s.sale();
    }
    
}
