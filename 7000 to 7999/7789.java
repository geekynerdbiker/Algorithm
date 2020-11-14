import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        int digit = Integer.parseInt(st.nextToken());

        if (isPrime(number) && isPrime(number + digit * 1000000))
            System.out.print("Yes");
        else System.out.print("No");

    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i < n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }
}
