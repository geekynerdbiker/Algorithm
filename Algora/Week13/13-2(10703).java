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

		int depth = 0;
		for( int i = 0; i < S; i++ )
			depth = Math.max(depth, findDepth(map, 0, i, 0, R));

		System.out.println(depth);z
		for( int i = 0; i < R; i++ )
			System.out.println(map[i]);
	}

	public static int findDepth(char [][] map, int depth, int indexX, int indexY, int R) {

		if( map[indexY][indexX] == 'X' )
			if( map[indexY+1][indexX] == 'X' )
				findDepth(map, depth+1, indexX, indexY+1, R);
		return depth;
	}
}