import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] cross = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++)
            cross[i] = Integer.parseInt(st.nextToken());

        int clocknum = getClockNum(getNumber(cross));

        int i = 1111, rank = 0;
        while( i <= clocknum) {
            if(getClockNum(i) == i) rank++;
            i++;
        }

        System.out.print(rank);
    }

    public static int getNumber(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum *= 10;
            sum += i;
        }

        return sum;
    }

    public static int getClockNum(int n) {
        int number = n;
        for (int i = 0; i < 3; i++) {
            n = n % 1000 * 10 + n / 1000;
            if (number > n) number = n;
        }
        return number;
    }
}