import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int result = 0;
	public static int sudoku [][] = new int[9][9];
	public static boolean visited [] = new boolean [9];

	public static void main(String args[]) throws IOException {
		for( int i = 0; i < 9; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for( int j = 0; j < 9; j++ )
				sudoku[i][j] = Integer.parseInt(st.nextToken());
		}
		backtrack(0, 0);

		bw.write(Integer.toString(result));
		bw.flush();
	}

	public static void backtrack(int x, int y) {
		if( x == 9 || y == 9 ) return;
		if( sudoku[x][y] == 0 ) {
		
		}
		else {
			backtrack(x+1, y);
			backtrack(x, y+1);
		}
	}
	
	public static boolean isValid(int x, int y, int value) {
		for( int i = 0; i < 9; i++ )
			if( sudoku[x][i] == value ) return false;
		
		for( int i = 0; i < 9; i++ )
			if( sudoku[i][y] == value ) return false;
		
		int xTmp = x / 3;
		int yTmp = y / 3;
		
		for( int i = xTmp; i < xTmp + 3; i++ )
			for( int j = yTmp; j < yTmp + 3; j++ )
				if( sudoku[i][j] == value ) return false;
		
		
		return true;
	}
}
//unSOLVED