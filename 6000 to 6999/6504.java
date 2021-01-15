import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(2);

        int index = 1;
        while (fibonacci.get(fibonacci.size() - 1) < 25000) {
            fibonacci.add(fibonacci.get(index - 1) + fibonacci.get(index));
            index++;
        }

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());

            int start = 0, mid = 0, end = fibonacci.size();

            while (start < end) {
                mid = (start + end) / 2;
                if (fibonacci.get(mid) < N) start = mid + 1;
                else end = mid - 1;
            }

            boolean[] fibonacciArray = new boolean[end + 1];
            int sum = 0;
            for (int i = end; i >= 0; i--)
                if (sum + fibonacci.get(i) <= N) {
                    if (i != end && i != 0 && fibonacciArray[i + 1]) continue;
                    sum += fibonacci.get(i);
                    fibonacciArray[i] = true;
                }
            sum = 0;
            for (int i = end; i > 0; i--)
                if (fibonacciArray[i]) sum += fibonacci.get(i - 1);
            System.out.println(sum);
        }
    }
}
