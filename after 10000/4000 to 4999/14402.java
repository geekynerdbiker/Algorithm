import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        ArrayList<Record> records = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();

            records.add(new Record(name, status));
        }

        Collections.sort(records);

        if (N == 0) System.out.print(0);
        else if (N == 1) System.out.print(1);
        else {
            int count = 0;
            Record prev, curr;
            for (int i = 1; i < N; i++) {
                prev = records.get(i - 1);
                curr = records.get(i);
                count++;

                if (!prev.name.equals(curr.name)) continue;
                if (prev.status.equals("+") && curr.status.equals("-")) count--;
            }
            System.out.print(count);
        }
    }
}

class Record implements Comparable<Record> {
    String name;
    String status;

    Record(String name, String status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public int compareTo(Record r) {
        if (name.compareTo(r.name) >= 0)
            return 1;
        return -1;
    }
}