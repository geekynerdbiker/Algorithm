import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int n = kb.nextInt();
        int k = 0;
        
        while( k * (k + 1) / 2 < n ) {
            k++;
        }
        
        n -= k * (k + 1) / 2;
        
        if( k % 2 != 0 )
            System.out.println( (1-n) + "/" + (k+n) );
        else
            System.out.println( (k+n) + "/" + (1-n) );
    }
}
