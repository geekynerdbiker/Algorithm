import java.io.*;
import java.util.ArrayList;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        while (solve()) ;
    }

    public static boolean solve() throws IOException {
        int N = Integer.parseInt(br.readLine());
        if (N == 0) return false;

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(N);

        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.get(i)) {
                System.out.print(numbers.size());
                return true;
            }
        }
        return true;
    }
}