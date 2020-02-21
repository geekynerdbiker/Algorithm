import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		
		Book [] books = new Book[N];
		
		for( int i = 0; i < N; i++ ) {
			String book = br.readLine();
		}
	}
}

class Book {
	int count = 0;
	String name;
	
	public Book(String name) {
		this.name = name;
	}
}