import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int r1 = -1 * A + (int) Math.sqrt((int) Math.pow(A, 2) - B);
        int r2 = -1 * A - (int) Math.sqrt((int) Math.pow(A, 2) - B);

        if (r1 == r2) System.out.print(r1);
        else System.out.print(r1 < r2 ? r1 + " " + r2 : r2 + " " + r1);
    }
}