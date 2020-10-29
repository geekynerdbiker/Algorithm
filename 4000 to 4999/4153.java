import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int n1 = kb.nextInt(), n2 = kb.nextInt(), n3 = kb.nextInt();
        
        while( n1 != 0 || n2 != 0 || n3 != 0 ) {
            isPytagoras(n1, n2, n3);
            
            n1 = kb.nextInt();
            n2 = kb.nextInt();
            n3 = kb.nextInt();
        }
        return;
    }
    
    public static void isPytagoras (int n1, int n2, int n3) {
        n1 = n1 * n1;
        n2 = n2 * n2;
        n3 = n3 * n3;
        
        if( n1 + n2 == n3 || n1 + n3 == n2 || n2 + n3 == n1 ) {
            System.out.println("right");
            return;
        }
        System.out.println("wrong");
        return;
    }
}
