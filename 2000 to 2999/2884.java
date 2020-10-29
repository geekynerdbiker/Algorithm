import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int a = kb.nextInt();
        int b = kb.nextInt();

        if( b - 45 >= 0 ) {
            b -= 45;
        }

        else {
            b += 15;
            if( a == 0 )
                a = 23;
            else
                a -= 1;
        }

        System.out.println(a + " " + b);
    }
}