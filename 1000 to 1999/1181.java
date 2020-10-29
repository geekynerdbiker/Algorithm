import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static String [] words;
    public static void main(String args[]) throws IOException{
        int N = Integer.parseInt(br.readLine());

        words = new String [N];

        for( int i = 0; i < N; i++ )
            words[i] = br.readLine();

        Arrays.sort(words, new Comparator<String>() {
            @Override public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        int j = 0;
        for( int i = 0; i < N; i++ ) {
            int len = words[i].length();

            for( j = i + 1; j < N; j++ ) {
                int lenTmp = words[j].length();

                if( len != lenTmp ) break;
            }

            Arrays.sort(words, i, j);
            i = j - 1;
        }


        for( int i = 0; i < N-1; i++ ) {
            if( words[i].equals(words[i+1]) ) continue;
            bw.write(words[i] + "\n");
        }

        bw.write(words[N-1] + "\n");
        bw.flush();
    }
}