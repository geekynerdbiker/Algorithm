import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) {
        int N = kb.nextInt(), index = N, res = 0;

        while( index > 0 ) {
            index--;

            int comp = index;
            int unit = index;

            while( unit != 0 ) {
                comp += unit % 10;
                unit /= 10;
            }

            if( comp == N ) res = index;
        }
        System.out.println(res);
    }
}
