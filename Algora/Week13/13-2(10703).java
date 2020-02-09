import java.io.*;
import java.util.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException{
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken()), S = Integer.parseInt(st.nextToken());
		char [][] map = new char [R][S];
		

		for( int i = 0; i < R; i++ )
			map[i] = br.readLine().toCharArray();

		dropComet(map, R, S, howHigh(map, R, S, 0));

		for( int i = 0; i < R; i++ )
			System.out.println(map[i]);
	}

	public static int howHigh(char [][] arr, int R, int S, int index) {
		int i = 0;
		for( int k = 0; k < R; k++ ) {
			i++;
			if( arr[k][index] == 'X' ) i = 0;
			if( arr[k+1][index] == '#' ) break;
		}
			
		if( index == S-1 ) return i;
		return Math.min(i, howHigh(arr, R, S, index+1));
	}
	
	public static void dropComet(char [][] arr, int R, int S, int depth) {
		int startPoint, endPoint;
		for( int i = 0; i < S; i++ ) {
			startPoint = 3000; endPoint = 0;
			
			for( int j = 0; j < R; j++ ) { 
				if( arr[j][i] == 'X' && arr[j+1][i] == '.' )
					endPoint = j+1;
				if( arr[j][i] == 'X' ) startPoint = Math.min(j, startPoint);
			}
			
			int tmpDepth = depth;
			for( int j = endPoint; tmpDepth > 0; tmpDepth--, j++ )
				arr[j][i] = 'X';
			for( int j = startPoint; j < depth; j++ )
				arr[j][i] = '.';
		}
	}
}