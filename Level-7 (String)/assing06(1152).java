import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        String s = kb.nextLine();
        
        StringTokenizer st = new StringTokenizer(s);
        
        System.out.println(st.countTokens());
    }
}
