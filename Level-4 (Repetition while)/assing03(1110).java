import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        int k = n;
        int cycle = 0;
        
        do {
            if( ((n / 10) + (n % 10)) < 10 )
                n = ((n / 10) + (n % 10)) + ((n % 10) * 10);
            else
                n = (((n / 10) + (n % 10)) % 10) + ((n % 10) * 10);
            cycle++;
        } while (k != n);
        
        System.out.println(cycle);
    }
}
