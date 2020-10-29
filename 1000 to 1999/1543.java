import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        List<Character> doc = new ArrayList<>();

        char[] s = br.readLine().toCharArray();
        char[] token = br.readLine().toCharArray();
        for (int i = 0; i < s.length; i++) doc.add(s[i]);

        if (s.length < token.length) {
            System.out.println(0);
            return;
        }

        int count = 0;
        for (int i = 0; i < doc.size() - token.length + 1; i++) {
            for (int j = 0; j < token.length; j++) {
                if (doc.get(i + j) != token[j]) break;

                if (j == token.length - 1) {
                    count++;
                    i += token.length - 1;
                }
            }
        }

        System.out.println(count);
    }
}