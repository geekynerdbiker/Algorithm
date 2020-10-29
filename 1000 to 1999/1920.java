import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int [] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            A[i] = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());
        int[] B = new int[M];

        if (M != 0) st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++)
            B[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(A);

        for (int i = 0; i < M; i++) {
            if (binarySearch(A, B[i])) bw.write("1\n");
            else bw.write("0\n");
        }
        bw.close();
    }

    static boolean binarySearch(int[] arr, int k) {
        int start = 0, mid, end = arr.length -1;

        if (arr[end] < k) return false;
        else if (arr[end] == k) return true;
        while (end - start >= 0) {
            mid = (end - start) / 2;

            if (arr[mid] == k)
                return true;
            if (arr[mid] > k)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }
}