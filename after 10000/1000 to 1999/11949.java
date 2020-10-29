import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] tickets = new int[N];
        for (int i=0; i < N; i++)
            tickets[i] = Integer.parseInt(br.readLine());

        for (int i = 2; i <= M; i++) {
            for (int j = 0; j < N-1; j++) {
                if(tickets[j] % i > tickets[j+1] % i) {
                    int tmp = tickets[j];
                    tickets[j] = tickets[j+1];
                    tickets[j+1] = tmp;
                }
            }
        }

        for (int i=0; i < N; i++)
            System.out.println(tickets[i]);
    }
}
