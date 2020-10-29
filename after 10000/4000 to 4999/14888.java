import java.io.*;
import java.util.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int N, value;
	public static int [] numbers;
	public static int max = Integer.MIN_VALUE;
	public static int min = Integer.MAX_VALUE;
	
	public static void main(String args[]) throws IOException {
		N = Integer.parseInt(br.readLine());
		numbers = new int [N];

		int [] cal = new int [4];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for( int i = 0; i < N; i++ )
			numbers[i] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for( int i = 0; i < 4; i++ )
			cal[i] = Integer.parseInt(st.nextToken());

		backtrack(cal.clone(), 0);
		
		bw.write(Integer.toString(max) + "\n");
		bw.write(Integer.toString(min));
		bw.flush();

	}

	public static void backtrack(int [] cal, int index) throws IOException{
		if( index == 0 ) value = numbers[0];
		if( index + 1 == N ) {
			max = Math.max(max, value);
			min = Math.min(min, value);
			value = numbers[0];
		}

		for( int i = 0; i < 4; i++ ) {
			if( cal[i] == 0 ) continue;
			else {
				cal[i]--;
				value = calculate(value, numbers[index +1], i);
				backtrack(cal, index+1);
				cal[i]++;
			}
			
		}

	}

	public static int calculate(int a, int b, int index) {
		switch(index) {

		case 0:
			return a + b;
		case 1:
			return a - b;
		case 2:
			return a * b;
		case 3:
			return a / b;
		default:
			return 0;
		}
	}
}