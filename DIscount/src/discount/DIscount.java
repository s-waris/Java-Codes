package discount;

public class DIscount {
    
    static double sum(double...Price){
        double total=0;
        for(double p : Price)
            total+=p;
        return discount(total);
    }
    
    static double discount(double sum){
        if(sum>=2000)
            return sum*0.9;
        else if(sum>=3000)
            return sum*0.85;
        else if(sum>=5000)
            return sum*0.75;
        else if(sum>=10000)
            return sum*0.6;
        else
            return sum;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
