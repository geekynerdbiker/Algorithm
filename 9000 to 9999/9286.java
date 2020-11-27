import java.io.*;

public class Main {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            bw.write("Case " + Integer.toString(i+1) + ":\n");
            for(int j=0; j <M; j++) {
                int grade = Integer.parseInt(br.readLine());
                if ( grade < 6)
                    bw.write(Integer.toString(grade+1) + "\n");
            }
        }
        bw.flush();
    }
}