import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int P = kb.nextInt();
        
        for( int i = 0; i < P; i++ ) {
            int R = kb.nextInt();
            String s = kb.next();
            
            for( int j = 0; j < s.length(); j++ )
                for( int k = 0; k < R; k++ )
                    System.out.print(s.charAt(j));
            
            System.out.println();
        }
    }
}
