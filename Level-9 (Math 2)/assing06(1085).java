import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int x = kb.nextInt(), y = kb.nextInt(), w = kb.nextInt(), h = kb.nextInt(), len;
        
        len = (((w - x < x) ? w - x : x) < (( h - y < y ) ? h - y : y)) ? ((w - x < x) ? w - x : x) : (( h - y < y ) ? h - y : y);
        System.out.println(len);
    }
}
