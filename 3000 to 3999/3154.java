import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] dial = {{4, 2}, {1, 1}, {2, 1}, {3, 1}, {1, 2}, {2, 2}, {3, 2}, {1, 3}, {2, 3}, {3, 3}};

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(st.nextToken(":"));
        int minute = Integer.parseInt(st.nextToken());

        int effort = Integer.MAX_VALUE;

        int bestT = time, bestM = minute;
        while (time < 100) {
            if (getEffort(bestT, bestM) > getEffort(time, minute)) {
                bestT = time;
                bestM = minute;
            }
            if (minute < 40)
                if (getEffort(bestT, bestM) > getEffort(bestT, bestM + 60)) {
                    bestM += 60;
                }
            time += 24;
        }
        if(bestT == 0 && bestM == 0) System.out.print(bestT + "0" + ":" + bestM + "0");
        else if(bestT == 0) System.out.print(bestT + "0" + ":" + bestM);
        else if(bestM == 0) System.out.print(bestT + ":" + bestM + "0");
        else System.out.print(bestT + ":" + bestM);
    }

    public static int getEffort(int time, int minute) {
        int[] digit = new int[4];

        for (int i = 0; i < 2; i++) {
            if (i == 0 && time < 10) digit[0] = 0;

            digit[1 - i] = time % 10;
            digit[3 - i] = minute % 10;

            time /= 10;
            minute /= 10;
        }

        return calEffort(dial[digit[0]], dial[digit[1]], dial[digit[2]], dial[digit[3]]);
    }
    public static int calEffort(int[] dial1, int[] dial2, int[] dial3, int[] dial4) {
        int sum1 = Math.abs(dial1[0] - dial2[0]) + Math.abs(dial1[1] - dial2[1]);
        int sum2 = Math.abs(dial2[0] - dial3[0]) + Math.abs(dial2[1] - dial3[1]);
        int sum3 = Math.abs(dial3[0] - dial4[0]) + Math.abs(dial3[1] - dial4[1]);
        return sum1 + sum2 + sum3;
    }
}