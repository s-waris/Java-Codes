package graphcells;
import java.util.*;
public class GraphCells {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int c = sc.nextInt();
        
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=c; j++)
            
                System.out.print("("+i+","+j+")");
            
            System.out.println("");
        }
    }
}
