import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        char c = kb.next().charAt(0);
        int ic = (int)c;
        
        System.out.printf("%d", ic);
        
    }
}
