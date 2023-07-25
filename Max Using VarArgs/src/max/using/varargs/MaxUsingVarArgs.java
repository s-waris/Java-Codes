package max.using.varargs;

public class MaxUsingVarArgs {
    
    static int varmax(int...n){
        int max=n[0];
        for (int i=0; i<n.length; i++)
            if(n[i]>max)
                max=n[i];
        
        return max;
    }

    public static void main(String[] args) {
        System.out.println(varmax(55,88,4,4,55,55));
    }
    
}
