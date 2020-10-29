import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()), P = Integer.parseInt(st.nextToken());
		int count = 0;
		Stack<Integer> [] stack = new Stack[6];

		for( int i = 0; i < 6; i++ ) {
			stack[i] = new Stack<Integer>();
			stack[i].push(0);
		}
		
		for( int i = 0; i < N; i++ ) {
			st = new StringTokenizer(br.readLine());
			int line = Integer.parseInt(st.nextToken()), flat = Integer.parseInt(st.nextToken());

			if( stack[line-1].isEmpty() ) stack[line-1].push(flat);
			else {
				while( stack[line-1].peek() > flat ) {
					stack[line-1].pop();
					count++;
				}

				if( stack[line-1].peek() == flat ) continue;
				else {
					stack[line-1].push(flat);
					count++;
				}
			}
		}
		System.out.println(count);
	}
}