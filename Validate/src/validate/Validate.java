package validate;

public class Validate {
    
    static boolean validate(String S){
        if(S.matches("[a-z A-Z]*"))
        {
            return true;
        }
        else
            return false;
    }
    
    static boolean validate(int n){
        if(n>2 && n<19)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        
        
        System.out.println(validate("Saad"));
        
        System.out.println(validate(9));
        
    }
    
}
