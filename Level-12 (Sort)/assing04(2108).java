import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static Deque<Integer> dq = new ArrayDeque<Integer>();
	public static void main(String[] args) throws IOException{
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int [N];
		int [] counter = new int [8001];
		
		for( int i = 0; i < N; i++ ) {
			int k = Integer.parseInt(br.readLine());
			arr[i] = k;
		}
		
		Arrays.sort(arr);

		int sum = 0;
		
		for( int i = 0; i < N; i++ )
			sum += arr[i];
		
		bw.write( Integer.toString( (int)Math.round(((double)sum / (double)N))) + "\n");
		bw.write( Integer.toString(arr[N/2]) + "\n");
		bw.flush();
		
		int max = 0;
		for( int i = 0; i < N; i++ ) {
			counter[arr[i] + 4000]++;
			max = Math.max(max, counter[arr[i] + 4000]);
		}
		
		int sec = 0, cnt = 0;
		for( int i = 0; i < counter.length; i++ ) {
			if( counter[i] == max ) {
				cnt++;
				sec = i - 4000;
			}
			
			if( cnt == 2 ) {
				sec = i - 4000;
				break;
			}
		}
		
		bw.write(Integer.toString(sec) + "\n");
		bw.flush();
		
		max = arr[0];
		int min = arr[0];
		
		for( int i = 0; i < N; i++ )
			max = Math.max(max, arr[i]);

		for( int i = 0; i < N; i++ )
			min = Math.min(min, arr[i]);
		
		bw.write(Integer.toString(max - min));
		bw.flush();
	}
}