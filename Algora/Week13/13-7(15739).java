import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException {
		boolean [][] paper = new boolean [100][100];
		int N = Integer.parseInt(br.readLine());

		for( int i = 0; i < N; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			fillPaper(paper, x, y);
		}
		
		int size = 0;
		for( int i = 0; i < 100; i++ )
			for( int j = 0; j < 100; j++ )
				if( paper[i][j] ) size++;

		bw.write(Integer.toString(size));
		bw.flush();
	}

	public static void fillPaper(boolean [][] set, int x, int y) {
		for( int i = x; i < x+10; i++ )
			for( int j = y; j < y+10; j++ )
				set[i][j] = true;
	}
}