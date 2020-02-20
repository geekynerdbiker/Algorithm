import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Country> countries = new ArrayList<Country>();
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());

		for( int i = 0; i < N; i++ ) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int gold = Integer.parseInt(st.nextToken());
			int silver = Integer.parseInt(st.nextToken());
			int bronze = Integer.parseInt(st.nextToken());

			countries.add(new Country(num, gold, silver, bronze));
		}
		
		countries.sort(new olympicComparator());
		isSamePlace(countries);
		for( int i = 0; i < countries.size(); i++ ) {
			if( countries.get(i).num == K ) 
				bw.write(Integer.toString(countries.get(i).place));
		}
		bw.flush();
	}
	
	public static void isSamePlace(ArrayList<Country> arr) {
		int place = 1;
		
		if( arr.size() == 1 )
			arr.get(0).getPlace(place);
		
		for( int i = 0; i < arr.size()-1; i++ ) {
			if( arr.get(i).place == 0 )
				arr.get(i).getPlace(place);

			if( arr.get(i).gold == arr.get(i+1).gold )
				if( arr.get(i).silver == arr.get(i+1).silver )
					if( arr.get(i).bronze == arr.get(i+1).bronze )
						arr.get(i+1).getPlace(arr.get(i).place);
			place++;
		}
		if( arr.get(arr.size()-1).place == 0 )
			arr.get(arr.size()-1).getPlace(place);
	}
}

class Country {
	int num;
	int gold;
	int silver;
	int bronze;
	int place = 0;

	public Country(int num, int gold, int silver, int bronze) {
		this.num = num;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}
	
	public void getPlace(int place) {
		this.place = place;
	}
}

class olympicComparator implements Comparator<Country> {
	@Override
	public int compare(Country s1, Country s2) {
		if( s1.gold < s2.gold ) return 1;
		else if( s1.gold == s2.gold ) {
			if( s1.silver < s2.silver ) return 1;
			else if( s1.silver == s2.silver ) {
				if( s1.bronze < s2.bronze ) return 1;
				else return -1;
			}
			else return -1;
		}
		else return -1;
	}
}