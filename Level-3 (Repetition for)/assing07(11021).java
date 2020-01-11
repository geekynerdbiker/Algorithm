import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        
        for( int i = 1; i <= n; i++ ) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            System.out.println("Case #" + i + ": " + (a+b));
        }
    }
}
	public static void main(String args[]) {
	}
}
