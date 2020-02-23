import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		int T = Integer.parseInt(br.readLine());

		while( T-- > 0 ) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum = 0;

			for( int i = 0; i < N; i++ )
				sum += Integer.parseInt(st.nextToken());

			bw.write(Integer.toString(sum) + "\n");
			bw.flush();
		}
	}
}