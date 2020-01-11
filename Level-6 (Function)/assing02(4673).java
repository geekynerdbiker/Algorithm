import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner kb = new Scanner(System.in);
        
        int [] arr = new int [10036];
        
        for( int i = 0; i < 10000; i++ )
            arr[isSelfNumber(i)]++;
        
        for( int i = 0; i < 10000; i++)
            if( arr[i] == 0 )
                System.out.println(i);
    }
    
    static int isSelfNumber( int n ) {
        int k = n;
        
        while( k > 0 ) {
            n += k % 10;
            k /= 10;
        }
        
        return n;
    }
}
