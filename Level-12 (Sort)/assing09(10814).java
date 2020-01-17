import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static String [][] ID;
	public static void main(String args[]) throws IOException{
		int N = Integer.parseInt(br.readLine());

		ID = new String [N][2];

		for( int i = 0; i < N; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			ID[i][0] = st.nextToken();
			ID[i][1] = st.nextToken();
		}
			 
			
		Arrays.sort(ID, new Comparator<String []>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
		
		for( int i = 0; i < N; i++ )
			bw.write(ID[i][0] + " " + ID[i][1] + "\n");
		bw.flush();
	}
}