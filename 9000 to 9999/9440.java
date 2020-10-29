import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int sum = 0;
    public static void main(String[] args) throws IOException {
        int N = 1;

        while (N != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            int[] input = new int[N];
            boolean[] visited = new boolean[N];

            for (int i = 0; i < N; i++)
                input[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(input);

            int len = N / 2 + N % 2;
            getSum(0, len, input, visited);
            System.out.println(sum);
        }
    }

    public static void getSum(int index, int len, int[] arr, boolean[] visited) {
        if (index == len) {
            int n1 = 0, n2 = 0;

            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) {
                    n1 *= 10;
                    n1 += arr[i];
                } else {
                    n2 *= 10;
                    n2 += arr[i];
                }
            }
            sum = n1 + n2;
        }

        visited[len] = true;
        for (int i = index; i < arr.length; i++)
            getSum(index+1, len, arr, visited);
        visited[len] = false;
    }
}