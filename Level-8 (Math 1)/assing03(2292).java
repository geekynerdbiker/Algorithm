import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int n = kb.nextInt();
        int i = 0, s = 0;
        
        while( true ) {
            if( n == 1 ) {
                System.out.println(1);
                break;
            }
            
            s += i;
            
            if( n > ((6 * s) + 1) && n <= ((6 * (s + i + 1)) + 1) ){
                System.out.println(i+2);
                break;
            }
            i++;
        }
    }
}
