import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String[] inputs = new String[N];
        char[] result = new char[50];

        for (int i = 0; i < N; i++) {
            inputs[i] = br.readLine();
            if (i == 0) result = inputs[i].toCharArray();
        }

        for (int i = 0; i < N; i++) {
            char [] string = inputs[i].toCharArray();
            for (int j = 0; j < inputs[i].length(); j++) {
                if (result[j] != string[j]) result[j] = '?';
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i < result.length; i++)
            sb.append(result[i]);

        bw.write(sb.toString());
        bw.close();
    }
}