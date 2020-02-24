import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), index = Integer.parseInt(st.nextToken()) - 1;
		List<Integer>  arr = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		for( int i = 0; i < N; i++ )
			arr.add(Integer.parseInt(st.nextToken()));
		
		Collections.sort(arr);
		
		bw.write(Integer.toString(arr.get(index)));
		bw.flush();
	}
}