import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> idols = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String group = br.readLine();
            int members = Integer.parseInt(br.readLine());

            for (int j = 0; j < members; j++) {
                String name = br.readLine();
                idols.put(name, group);
            }
        }

        List<String> group = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String quiz = br.readLine();
            int quest = Integer.parseInt(br.readLine());

            if (quest == 1)
                System.out.println(idols.get(quiz));
            else {
                idols.forEach((key, value) -> {
                    if(value.equals(quiz))
                        group.add(key);
                });
                Collections.sort(group);

                for (int j = 0; j < group.size(); j++)
                    System.out.println(group.get(j));
            }
            group.clear();
        }
    }
}