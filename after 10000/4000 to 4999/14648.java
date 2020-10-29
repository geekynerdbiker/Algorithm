import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException {
        int N = kb.nextInt(), Q = kb.nextInt();
        int [] arr = new int [N];
        
        for( int i = 0; i < N; i++ )
            arr[i] = kb.nextInt();
        
        for( int i = 0; i < Q; i++ ) {
            int q = kb.nextInt();
            if( q == 1 )
                System.out.println(query1(arr, kb.nextInt(), kb.nextInt()));
            else if( q == 2 )
                System.out.println(query2(arr, kb.nextInt(), kb.nextInt(), kb.nextInt(), kb.nextInt()));
        }
    }
    
    public static long query1(int [] data, int a, int b) {
        long sum = 0;
        
        for( int i = a-1; i < b; i++ )
            sum += data[i];
        swap(data, a, b);
        
        return sum;
    }
    
    public static long query2(int [] data, int a, int b, int c, int d) {
        long sum = 0;
        
        for( int i = a-1; i < b; i++ )
            sum += data[i];
        for( int i = c-1; i < d; i++ )
            sum -= data[i];
        
        return sum;
    }
    
    public static void swap(int [] data, int a, int b) {
        int tmp = data[a-1];
        data[a-1] = data[b-1];
        data[b-1] = tmp;
    }
}
