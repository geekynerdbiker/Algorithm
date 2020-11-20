import java.io.*;
import java.util.StringTokenizer;

public class Main {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if( a == 0 ) break;

            int leaves = 1;
            for(int i=0; i < a*2; i++)
                if( i % 2 == 0)
                    leaves *= Integer.parseInt(st.nextToken());
                else
                    leaves -= Integer.parseInt(st.nextToken());

            bw.write(leaves + "\n");
            bw.flush();
        }
    }
}
