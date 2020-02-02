import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int N, sum = 0;
	public static int [] energy = new int [10];
	public static boolean [] visited = new boolean[10];
	public static void main(String args[]) throws IOException {
		N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		for( int i = 0; i < N; i++ )
			energy[i] = Integer.parseInt(st.nextToken());

		getEnergy(0, 0);
		bw.write(Integer.toString(sum));
		bw.flush();
	}

	public static void getEnergy(int energy, int count){
		if( count == N - 2 ) {
			sum = Math.max(sum, energy);
			return;
		}
		
		for( int i = 1; i < N-1; i++ ) {
			if( !visited[i] ) visited[i] = true;
			
			int left = getLeft(i);
			int right = getRight(i);
			
			getEnergy(energy + (left * right), count + 1);
			
			visited[i] = false;
		}
	}
	
	public static int getLeft(int n) {
		int left = n;

		while( true ) {
			left--;
			if( !visited[left] ) break;
		}
		return energy[left];
	}

	public static int getRight(int n) {
		int right = n;

		while( true ) {
			right++;
			if( !visited[right] ) break;
		}
		return energy[right];
	}
}