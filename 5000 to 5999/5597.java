import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		int n;
		boolean [] student = new boolean [31];

		for( int i = 0; i < 28; i++ ) {
			n = Integer.parseInt(br.readLine());
			student[n] = true;
		}

		for( int i = 1; i <= 30; i++ )
			if(	!student[i] ) bw.write(Integer.toString(i) + "\n");
		bw.flush();
	}
}