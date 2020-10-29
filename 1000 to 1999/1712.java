import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int A = kb.nextInt();
        int B = kb.nextInt();
        int C = kb.nextInt();
        int k = 0;
        
        if( B >= C ) {
            System.out.println("-1");
            return;
        }
        
        while( A >= 0 ) {
            A += (B-C);
            k++;
        }
        System.out.println(k);
    }
}
