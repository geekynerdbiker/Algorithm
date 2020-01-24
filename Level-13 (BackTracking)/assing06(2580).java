import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int N = 9;
	public static int sudoku [][] = new int[N+1][N+1];
	public static ArrayList<Point> Points = new ArrayList<>();

	public static void main(String args[]) throws IOException {
		for( int i = 1; i <= N; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for( int j = 1; j <= N; j++ ) {
				sudoku[i][j] = Integer.parseInt(st.nextToken());
				if( sudoku[i][j] == 0 ) Points.add(new Point(i, j));
			}
		}
		backtrack(0);
	}

	public static void backtrack(int index)	throws IOException {
		if( index == Points.size() ) {
			printBoard();
			System.exit(0);
		}

		else {
			Point current = Points.get(index);
			for( int i = 1; i <= N; i++ ) {
				if( isValid(current.x, current.y, i) ) {
					sudoku[current.x][current.y] = i;
					backtrack(index+1);
					sudoku[current.x][current.y] = 0;

				}
			}
		}
	}

	public static boolean isValid(int x, int y, int value) {
		for( int i = 1; i <= N; i++ )
			if( sudoku[x][i] == value ) return false;

		for( int i = 1; i <= N; i++ )
			if( sudoku[i][y] == value ) return false;

		int xTmp = ((x - 1) / 3) * 3 + 1;
		int yTmp = ((y - 1) / 3) * 3 + 1;

		for( int i = xTmp; i < xTmp + 3; i++ )
			for( int j = yTmp; j < yTmp + 3; j++ )
				if( sudoku[i][j] == value ) return false;

		return true;
	}

	public static void printBoard() throws IOException {
		for( int i = 1; i <= N; i++ ) {
			for( int j = 1; j <= N; j++ )
				System.out.print(sudoku[i][j] + " ");
			System.out.println();
		}
	}
}

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}