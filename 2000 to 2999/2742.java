import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        
        for( int i = n; i > 0; i-- )
            System.out.println(i);
    }
}
