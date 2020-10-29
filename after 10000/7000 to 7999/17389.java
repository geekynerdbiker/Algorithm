import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        if (N == 0) {
            System.out.println(0);
            return;
        }

        char[] answers = br.readLine().toCharArray();
        int bonus = 0, total = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == 'O') {
                total += i + 1;
                total += bonus;
                bonus++;
            }
            else bonus = 0;
        }

        System.out.println(total);
    }
}