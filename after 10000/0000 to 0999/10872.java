import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        System.out.println(factorial(n));
    }

    static int factorial( int k ) {
        if(k < 2)
            return 1;

        return k * factorial(k - 1);
    }
}