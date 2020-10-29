import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        int count = 0;
        
        for( int i = 1; i <= n; i++) {
            if( isIso(i) == true)
                count++;
        }
        
        System.out.println(count);
    }
    
    static boolean isIso( int k ) {
        
        if( k < 100 )
            return true;
        
        else if(k == 1000)
            return false;
        
        else {
            int [] n = new int [3];
            
            for( int i = 0; i < 3; i++) {
                n[i] = k % 10;
                k /= 10;
            }
            
            if( (n[0] - n[1]) == (n[1] - n[2]) )
                return true;
            return false;
        }
    }
}
