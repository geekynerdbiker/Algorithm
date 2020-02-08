import java.io.*;
import java.util.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException{
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken()), S = Integer.parseInt(st.nextToken());
		//char [][] map = new char [R][S];
		ArrayList<char []> map = new ArrayList<char []>();

		for( int i = 0; i < R; i++ ) {
			char [] line = br.readLine().toCharArray();
			map.add(line);
		}

		while( findEmptySky(map, R, S) > -1 ) {
			
		}

		for( int i = 0; i < R; i++ )
			System.out.println(map.get(i));
	}

	public static int findEmptySky(ArrayList<char []> arr, int R, int S) {
		for( int i = 0; i < R; i++ )
			for( int j = 0; j < S; j++ ) {
				if( arr.get(i)[j] != '.') break;
				if( j == S - 1 && arr.get(i)[j] == '.' ) return i;
			}
		return -1;
	}

	public static void dropComet(ArrayList<char []> arr, int R, int S, int index) {

	}
}