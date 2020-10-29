import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N;
        int start = 1, end = 10;
        boolean[] number = new boolean[11];
        String answer;

        while (true) {
            N = Integer.parseInt(br.readLine());
            if (N == 0) break;
            answer = br.readLine();

            if (answer.compareTo("too high") == 0)
                for (int i = end; i >= N; i--) number[i] = true;
            else if (answer.compareTo("too low") == 0)
                for (int i = start; i <= N; i++) number[i] = true;
            else if (answer.compareTo("right on") == 0) {
                if (number[N]) System.out.print("Stan is dishonest\n");
                else System.out.print("Stan may be honest\n");
                number = new boolean[11];
            }
        }
    }
}