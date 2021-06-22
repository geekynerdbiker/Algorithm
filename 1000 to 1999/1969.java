import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] input = new String[N];
        int[][] ATGC = new int[M][4];

        for (int i = 0; i < N; i++)
            input[i] = br.readLine();

        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                switch (input[j].charAt(i)) {
                    case 'A': {
                        ATGC[i][0]++;
                        break;
                    }
                    case 'T': {
                        ATGC[i][1]++;
                        break;
                    }
                    case 'G': {
                        ATGC[i][2]++;
                        break;
                    }
                    case 'C': {
                        ATGC[i][3]++;
                        break;
                    }
                }

        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < M; i++) {
            int max = 0;
            String dna = "";

            for (int j = 0; j < 4; j++) {
                if (ATGC[i][j] > max) {
                    max = ATGC[i][j];
                    switch (j) {
                        case 0: {
                            dna = "A";
                            break;
                        }
                        case 1: {
                            dna = "T";
                            break;
                        }
                        case 2: {
                            dna = "G";
                            break;
                        }
                        case 3: {
                            dna = "C";
                            break;
                        }
                    }
                }
            }
            sb.append(dna);
            sum += N - max;
        }

        sb.append("\n");
        sb.append(sum);
        bw.write(sb.toString());
        bw.flush();
    }
}