import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> al = new ArrayList<Integer>();

        for( int i = 0; i < N; i++ )
            al.add(Integer.parseInt(br.readLine()));

        Collections.sort(al);

        for( int i = 0; i < N; i++ )
            bw.write(al.get(i).toString() + "\n");
        bw.close();
    }
}