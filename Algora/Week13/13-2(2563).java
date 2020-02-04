import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException {
		int N = Integer.parseInt(br.readLine());
		ArrayList<Square> squares = new ArrayList<Square>();
		
		for( int i = 0; i < N; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			squares.add(new Square(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		getSize(squares);
		bw.flush();
	}
	
	public static int getSize(ArrayList<Square> arr) {
		for( int x = 0; x < arr.size(); x++ ) {
			
		}
			
		return 0;
	}
}

class Square {
	int x1, y1;
	int x2, y2;
	
	Square(int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;
		
		this.x2 = x1 + 10;
		this.y2 = y1 + 10;
	}
}