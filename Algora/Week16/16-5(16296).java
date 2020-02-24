import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		while( true ) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			long dd = Integer.parseInt(st.nextToken());
			long mm = Integer.parseInt(st.nextToken());
			long yy = Integer.parseInt(st.nextToken());
			
			if( dd == 0 && mm == 0 && yy == 0 ) return;
			char [] message = br.readLine().toCharArray();
			
			long key = (dd%25 + mm%25 + yy%25) % 25 + 1;

			for( int i = 0; i < message.length; i++ ) {
				if( message[i] >= 'a' && message[i] <= 'z') {
					if( message[i] - key >= 'a' ) message[i] -= key;
					else message[i] += 26-key;
				}
				bw.write(message[i]);
			}
			
			bw.write("\n");
			bw.flush();
		}
	}
}