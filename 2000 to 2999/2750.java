import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		int N = Integer.parseInt(br.readLine());
		int [] array = new int [N];
		
		for( int i = 0; i < N; i++ )
			array[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(array);
		
		for( int i = 0; i < N; i++ )
			System.out.println(array[i]);
	}
}