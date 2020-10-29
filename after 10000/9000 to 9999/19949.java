import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int result = 0;
    public static int[] answer = new int[10];
    public static int[] OMR = new int[10];
    public static boolean[] visited = new boolean[10];

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 10; i++)
            answer[i] = Integer.parseInt(st.nextToken());

        DFS(0);
        System.out.print(result);
    }

    public static void DFS(int index) {
        int[] selection = {1, 2, 3, 4, 5};

        if (index == 10) {
            int score = 0;
            for (int i = 0; i < 10; i++)
                if (OMR[i] == answer[i]) score++;
            if (score >= 5) result++;
            return;
        }

        for (int i = 0; i < 5; i++) {
            visited[index] = true;
            if (index > 1)
                if (OMR[index - 2] == OMR[index - 1] && OMR[index - 1] == selection[i]) continue;
            OMR[index] = selection[i];
            DFS(index + 1);
            visited[index] = false;
        }

    }
}