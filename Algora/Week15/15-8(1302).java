import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		
		boolean registered;
		ArrayList<Book> books = new ArrayList<Book>();

		for( int i = 0; i < N; i++ ) {
			String book = br.readLine();
			registered = false;

			for( int j = 0; j < books.size(); j++ )
				if( books.get(j).name.equals(book) ) {
					books.get(j).count++;
					registered = true;
					break;
				}
			if( !registered ) books.add(new Book(book));
		}

		books.sort( new ASC() );
		bw.write(books.get(0).name);
		bw.flush();
	}
}

class Book {
	int count = 0;
	String name;

	public Book(String name) {
		this.name = name;
	}
}

class ASC implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {
		if( o1.count < o2.count ) return 1;
		if( o1.count == o2.count )
			if( o1.name.compareTo(o2.name) > 0 ) return 1;
			else return -1;
		else return -1;
	}
}