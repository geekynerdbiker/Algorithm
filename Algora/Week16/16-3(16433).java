import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken()) - 1, C = Integer.parseInt(st.nextToken()) - 1;
	
		char [][] farm = new char [N][N];
		
	
			for( int i = 0; i < N; i++ )
				for( int j = 0; j < N; j++ )
					if( (R+C) % 2 == (i+j) % 2 ) farm[i][j] = 'v';
					else farm[i][j] = '.';
	
		
		for( int i = 0; i < N; i++ ) {
			for( int j = 0; j < N; j++ )
				bw.write(farm[i][j]);
			bw.write("\n");
		}
		bw.flush();
	}
}