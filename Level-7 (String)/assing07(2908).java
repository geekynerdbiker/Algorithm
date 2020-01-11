import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        char [] A = kb.next().toCharArray();
        char [] B = kb.next().toCharArray();
        
        char tmp = A[0];
        A[0] = A[2];
        A[2] = tmp;
        
        tmp = B[0];
        B[0] = B[2];
        B[2] = tmp;
        
        for( int i = 0; i < 3; )
            if( (int)A[i] > (int)B[i] ) {
                System.out.println(A);
                break;
            }
        
            else if ( (int)A[i] < (int)B[i] ) {
                System.out.println(B);
                break;
            }
        
            else
                i++;
    }
}
