import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int R = kb.nextInt();
        
        System.out.println(String.format("%.6f", Math.PI * R * R));
        System.out.println(String.format("%.6f", (double)2 * R * R));
    }
}
