import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

		int [][] map = new int [N][N];
		int [][] len = new int [13][100];

		ArrayList<Pair> house = new ArrayList<Pair>();
		ArrayList<Pair> chicken = new ArrayList<Pair>();

		for( int i = 0; i < N; i++ ) {
			st = new StringTokenizer(br.readLine());
			for( int j = 0; j < N; j++ ) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if( map[i][j] == 1 ) house.add(new Pair(i,j));
				if( map[i][j] == 2 ) chicken.add(new Pair(i, j));
			}
		}

		getLength(len, chicken, house);
		
		boolean [] visited = new boolean[chicken.size()];
		
		for( int i = 0; i < chicken.size(); i++ ) {
			for( int j = 0; j < house.size(); j++)			
				System.out.print(len[i][j] + " ");
			System.out.println();
		}


	}
	
	public static void findMinimum() {
		
	}

	public static void getLength(int [][] arr, ArrayList<Pair> c, ArrayList<Pair> h) {
		for( int i = 0; i < c.size(); i++ )
			for( int j = 0; j < h.size(); j++ )
				arr[i][j] = calculate(c.get(i), h.get(j));
	}

	public static int calculate(Pair p1, Pair p2) {
		return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
	}
}

class Pair {
	int x, y;

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}