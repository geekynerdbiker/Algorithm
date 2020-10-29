import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int C, blockNum;
	public static int [] height;
	public static String [][] Block = { { "0", "0000" }, { "00" }, { "001", "10" }, { "100", "01" }, { "000", "10", "01", "101" }, { "000", "00", "011", "20" }, { "000", "00", "110", "02" } };
	public static void main(String args[]) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());

		C = Integer.parseInt(st.nextToken());
		blockNum = Integer.parseInt(st.nextToken());
		height = new int [C];
		
		st = new StringTokenizer(br.readLine());
		for( int i = 0; i < C; i++ )
			height[i] = Integer.parseInt(st.nextToken());
		
		int result = 0;
		for( int i = 0; i < Block[blockNum].length; i++ ) 
			result += check(Block[blockNum][i]);
		
		bw.write(Integer.toString(result));
		bw.flush();
	}
	
	public static int check(String s) {
		int result = 0;
		char [] blockHeight = s.toCharArray();
		
		for( int i = 0; i <= C - blockHeight.length; i++ ) {
			int prevHeight = height[i] - blockHeight[0];
			boolean isSame = true;
		
			for( int j = 0; j < blockHeight.length; j++ )
				if( prevHeight != height[i+j] - blockHeight[j] ) isSame = false;
			if( isSame ) result++;
		}
		return result;
	}
}