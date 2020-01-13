import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException{
		int N = Integer.parseInt(br.readLine());
		int count = 0;

		while( N >= 5 ) {
			if( N % 5 == 0) {
				count = N / 5;
				bw.write(Integer.toString(count));
				bw.flush();
				
				return;
			}
			N -= 5;
			count++;
		}

		while( count != -1 ) {
			if( N % 3 == 0 ) {
				count += N / 3;
				break;
				}
			else {
				count--;
				N += 5;
			}
		}
		bw.write(Integer.toString(count));
		bw.flush();
	}
}