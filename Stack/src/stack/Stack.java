package stack;

import java.util.Scanner;
class stackOverFlowException extends Exception{
    
    @Override
    public String toString(){
        return "The Stack is Full, Size limit reached.";
    }
}
    
class stackUnderFlowException extends Exception{
    
    @Override
    public String toString(){
        return "The Stack is Empty, Nothing to return";
    }
}

class stackCreation {
    
    int count = -1;
    int s[];
    
    public void stack(int size){
        s=new int [size];
    }
    
    public void push(int num) throws stackOverFlowException
    {
        if (count>=s.length-1){
            throw new stackOverFlowException();
        }
        else
        s[++count]=num;
    }
    
    public void pop()throws stackUnderFlowException 
    {
        if (count<=-1){
                throw new stackUnderFlowException();  
        }
        else
        System.out.println("The number is : "+s[count--]);
    }
    
}

public class Stack {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        stackCreation st = new stackCreation();
        System.out.println("Enter the Size of the Stack : ");
        int size = sc.nextInt();
        st.stack(size);
        
        System.out.println("Enter 1 for push \nEnter 2 for pop \nEnter 3 to exit");
        while(true){
            System.out.println("Enter your choice : ");
            int n = sc.nextInt();
            switch (n){
                case 1 : {
                    System.out.println("Enter the number to be pushed");
                    int num=sc.nextInt();
                    try{
                        st.push(num);
                    }
                    catch (stackOverFlowException e){
                        System.out.println(e);
                    }
                }
                break;
                case 2 : {
                    try{
                        st.pop();
                    }
                    catch (stackUnderFlowException e){
                        System.out.println(e);
                    }
                }
                break;
                case 3 : System.exit(0);
                break;
                }
                
        }
    }
    
}


/*package stack;

import java.util.Scanner;
class stackOverFlowException extends Exception{
    
    @Override
    public String toString(){
        return "The Stack is Full, Size limit reached.";
    }
}
    
class stackUnderFlowException extends Exception{
    
    @Override
    public String toString(){
        return "The Stack is Empty, Nothing to return";
    }
}

class stackCreation {
    
    int count = -1;
    int s[];
    
    public void stack(int size){
        s=new int [size];
    }
    
    public void push(int num) throws stackOverFlowException
    {
        if (count>=s.length-1){
            throw new stackOverFlowException();
        }
        s[++count]=num;
    }
    
    public void pop()throws stackUnderFlowException 
    {
        if (count<0){
                throw new stackUnderFlowException();  
        }
        System.out.println("The number is : "+s[count--]);
    }
    
}

public class Stack {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        stackCreation st = new stackCreation();
        System.out.println("Enter the Size of the Stack : ");
        int size = sc.nextInt();
        st.stack(size);
        
        System.out.println("Enter 1 for push \nEnter 2 for pop \nEnter 3 to exit");
        while(true){
            System.out.println("Enter your choice : ");
            int n = sc.nextInt();
            switch (n){
                case 1 : {
                    System.out.println("Enter the number to be pushed");
                    int num=sc.nextInt();
                    try{
                        st.push(num);
                    }
                    catch (stackOverFlowException e){
                        System.out.println(e);
                    }
                }
                break;
                case 2 : {
                    try{
                        st.pop();
                    }
                    catch (stackUnderFlowException e){
                        System.out.println(e);
                    }
                }
                break;
                case 3 : System.exit(0);
                break;
                }
                
        }
    }
    
}
*/
