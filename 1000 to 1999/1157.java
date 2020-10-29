import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);

    public static void main(String args[]) {
        int [] alpha = new int[26];
        int rst = 0, cnt = 0, index = 0;

        String s = kb.next();

        for( int i = 0; i < s.length(); i++ )
            if( s.charAt(i) >= 65 && s.charAt(i) <= 90)
                alpha[s.charAt(i) - 65]++;
            else if( s.charAt(i) >= 97 && s.charAt(i) <= 122)
                alpha[s.charAt(i) - 97]++;

        for( int i = 0; i < alpha.length; i++ )
            if( rst < alpha[i] ) {
                rst = alpha[i];
                index = i;
            }

        for( int i = 0; i < alpha.length; i++ )
            if( rst == alpha[i] )
                cnt++;

        if( cnt == 1 )
            System.out.println((char)(index + 65));
        else
            System.out.println("?");
    }
}