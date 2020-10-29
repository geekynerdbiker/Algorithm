import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int n = kb.nextInt();
        int ic, sum = 0;
        
        String s = kb.next();
        char [] c = new char [n];
        
        for( int i = 0; i < n; i++ ) {
            c[i] = s.charAt(i);
            ic = (int)c[i] - 48;
            sum += ic;
        }
        
        System.out.println(sum);
        
    }
}
