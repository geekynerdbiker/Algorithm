import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        BigInteger sum = BigInteger.ZERO;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i < N; i++)
            sum = sum.add(BigInteger.valueOf(Integer.parseInt(st.nextToken())));

        st = new StringTokenizer(br.readLine());
        for(int i=0; i < M; i++)
            sum = sum.add(BigInteger.valueOf(Integer.parseInt(st.nextToken())));

        bw.write(sum.toString());
        bw.flush();
    }
}