package palindrome.string;

import java.util.Scanner;

public class PalindromeString {
    
    static String Pal(String S, String temp, int length){
        
        if(S.length()==0)
            return temp;
        Pal(S, temp, length--);
        temp+=S.charAt(0);
        return temp;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the String : ");
        String S = sc.nextLine();
        int length = S.length();
        System.out.println(Pal(S,"",length));
    }
    
}
