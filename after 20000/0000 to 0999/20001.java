import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if( M == 1 || M == 2) System.out.print("NEWBIE!");
        else if (M <= N) System.out.print("OLDBIE!");
        else System.out.print("TLE!");
    }
}