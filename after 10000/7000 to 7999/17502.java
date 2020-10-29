import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        char[] word = br.readLine().toCharArray();

        for (int i = 0; i < N / 2 + 1; i++) {
            if (word[i] == '?' || word[N - i - 1] == '?') {
                if (word[i] == '?' && word[N - i - 1] == '?') {
                    word[i] = 'a';
                    word[N - i - 1] = 'a';
                } else if (word[i] == '?')
                    word[i] = word[N - i - 1];
                else word[N - i - 1] = word[i];
            }
        }

        for (int i = 0; i < N; i++)
            System.out.print(word[i]);
    }
}