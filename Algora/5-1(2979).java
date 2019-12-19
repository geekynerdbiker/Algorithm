package exercises;

import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int A = kb.nextInt(), B = kb.nextInt(), C = kb.nextInt();
        
        int [] park = new int[100];
        int sum = 0;
        
        for( int i = 0; i < 3; i++ ) {
            int arr = kb.nextInt();
            int dep = kb.nextInt();
            
            for( int j = arr; j < dep; j++ )
                park[j]++;
        }
        
        for (int i = 0; i < 100; i++) {
            if( park[i] == 1 )
                sum += A;
            else if( park[i] == 2 )
                sum += 2*B;
            else if( park[i] == 3 )
                sum += 3*C;
        }
        System.out.println(sum);
    }
}
