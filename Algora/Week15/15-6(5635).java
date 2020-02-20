import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		int N = Integer.parseInt(br.readLine());
		ArrayList<Student> students = new ArrayList<Student>();

		for( int i = 0; i < N; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int day = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken());
			int year = Integer.parseInt(st.nextToken());

			students.add(new Student(name, day, month, year));
		}
		
		students.sort(new birthComparator());

		bw.write(students.get(0).name + "\n" + students.get(students.size()-1).name);
		bw.flush();
	}
}

class Student {
	String name;
	int day;
	int month;
	int year;

	public Student(String name, int day, int month, int year) {
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
	}
}

class birthComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		if( s1.year < s2.year ) return 1;
		else if( s1.year == s2.year ) {
			if( s1.month < s2.month ) return 1;
			else if( s1.month == s2.month ) {
				if( s1.day < s2.day ) return 1;
				else return -1;
			}
			else return -1;
		}
		else return -1;
	}
}