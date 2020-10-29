import java.io.*;
import java.util.Map;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        char[] SK = {'A', 'B', 'C'};
        char[] CY = {'B', 'A', 'B', 'C'};
        char[] HJ = {'C', 'C', 'A', 'A', 'B', 'B'};
        int[] score = {0, 0, 0};
        String[] name = {"Adrian", "Bruno", "Goran"};

        int len = Integer.parseInt(br.readLine());
        char[] answer = br.readLine().toCharArray();


        for (int i = 0, sk = 0, cy = 0, hj = 0; i < len; i++, sk++, cy++, hj++) {
            if (sk == 3) sk = 0;
            if (cy == 4) cy = 0;
            if (hj == 6) hj = 0;

            if (answer[i] == SK[sk]) score[0]++;
            if (answer[i] == CY[cy]) score[1]++;
            if (answer[i] == HJ[hj]) score[2]++;
        }

        int highest = 0;
        for (int i = 0; i < 3; i++)
            highest = Math.max(highest, score[i]);

        System.out.println(highest);
        for (int i = 0; i < 3; i++)
            if (highest == score[i])
                System.out.println(name[i]);
    }
}