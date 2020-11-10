import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
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

        for (int i = 0; i < N; i++)
            System.out.println(records.get(i).name + " " +records.get(i).status);
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
        if(name.compareTo(r.name) >= 0)
            return 1;
        return -1;
    }
}
