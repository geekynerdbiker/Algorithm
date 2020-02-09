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
		
		boolean X = false;
		for( int k = 0; k < R; k++ ) {
			i++;
			if( arr[k][index] == 'X' ) {
				X = true;
				i = 0;
			}
			if( k == R - 1) break;
			if( arr[k+1][index] == '#' ) break;
		}
		if( X == false ) i = 3001;	
		if( index == S-1 ) return i;
		return Math.min(i, howHigh(arr, R, S, index+1));
	}
	
	public static void dropComet(char [][] arr, int R, int S, int depth) {
		int startPoint, endPoint;
		for( int i = 0; i < S; i++ ) {
			startPoint = 3001; endPoint = 0;
			
			for( int j = 0; j < R; j++ ) { 
				if( arr[j][i] == 'X' && arr[j+1][i] == '.' )
					endPoint = j+1;
				if( arr[j][i] == 'X' ) startPoint = Math.min(j, startPoint);
				
			}
			for( int j = endPoint; j < endPoint + depth; j++ )
				arr[j][i] = 'X';
			if( startPoint == 3001 ) startPoint = 0;
			for( int j = startPoint; j < startPoint + depth; j++ )
					arr[j][i] = '.';
		}
	}
}