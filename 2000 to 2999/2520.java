import java.io.*;
import java.util.StringTokenizer;

public class Main {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            br.readLine();
            int[] ingredient = new int[5];
            int[] subIngredient = new int[4];
            double[] requires = {0.5, 0.5, 0.25, 0.0625, 0.5625};
            int[] tastes = {1, 30, 25, 10};

            StringTokenizer st = new StringTokenizer(br.readLine());
            double mix = Integer.MAX_VALUE;
            for (int i = 0; i < 5; i++) ingredient[i] = Integer.parseInt(st.nextToken());
            for (int i = 0; i < 5; i++) mix = Math.min(mix, ingredient[i] / requires[i]);
            mix *= 16;

            st = new StringTokenizer(br.readLine());
            int taste = 0;
            for (int i = 0; i < 4; i++) subIngredient[i] = Integer.parseInt(st.nextToken());
            for (int i = 0; i < 4; i++) taste += subIngredient[i] / tastes[i];

            int cakes = Math.min((int)mix, taste);
            bw.write(Integer.toString(cakes));
            bw.flush();
        }
    }
}