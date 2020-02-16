import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int KJM = Integer.parseInt(st.nextToken()), LHS = Integer.parseInt(st.nextToken());
		int round = 0;
		
		while ( KJM != LHS ) {
			KJM = nextNum(KJM);
			LHS = nextNum(LHS);
			round++;a
		}
		
		bw.write(Integer.toString(round));
		bw.flush();
	}
	
	public static int nextNum(int k) {
		if( k % 2 == 0 ) return k / 2;
		else return k / 2 + 1;
	}
}