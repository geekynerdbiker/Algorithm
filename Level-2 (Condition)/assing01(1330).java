import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int a = kb.nextInt();
        int b = kb.nextInt();
        
        if ( a < b )
            System.out.println("<");
        else if ( a > b )
            System.out.println(">");
        else
            System.out.println("==");
    }
}
