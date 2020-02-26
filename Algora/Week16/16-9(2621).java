import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		int [] color = new int [4];
		int [] number = new int [10];

		for( int i = 0; i < 5; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			if( s.equals("B") ) color[0]++;
			else if( s.equals("G") ) color[1]++;
			else if( s.equals("R") ) color[2]++;
			else if( s.equals("Y") ) color[3]++;
			
			number[Integer.parseInt(st.nextToken())]++;
		}

		bw.write(Integer.toString(checkHand(color, number)));
		bw.flush();
	}

	public static int checkHand(int [] color, int [] number) {
		int score = 0;
		int pair = isPairs(number);

		if( isFlush(color) && isStraight(number) )
			return 900 + getBiggest(number);
		if( isFourCard(number) )
			return 800 + getFourCard(number);
		if( isTriple(number) && pair == 1 )
			return 700 + getTriple(number) * 10 + getSmallPair(number);
		if( isFlush(color) )
			return 600 + getBiggest(number);
		if( isStraight(number) )
			return 500 + getBiggest(number);
		if( isTriple(number) )
			return 400 + getTriple(number);
		if( pair == 2 )
			return 300 + getBigPair(number) * 10 + getSmallPair(number);
		if( pair == 1 )
			return 200 + getSmallPair(number);
		if( true )
			return 100 + getBiggest(number); 

		return 0;
	}

	public static boolean isFlush(int [] color) {
		for( int i = 0; i < 4; i++ )
			if( color[i] == 4 )
				return true;
		return false;
	}

	public static boolean isStraight(int [] number) {
		int start = 0, count = 0;
		for( int i = 1; i < number.length; i++ )
			if( number[i] != 0 ) {
				start = i;
				break;
			}
		
		for( int i = start; i < number.length; i++ )
			if( number[i] == 1 &&  number[i+1] == 1 ) count++;
		
		if( count == 3 ) return true;
		return false;
	}

	public static boolean isFourCard(int [] number) {
		for( int i = 1; i < number.length; i++ )	
			if( number[i] == 4 ) return true;
		return false;
	}

	public static int getFourCard(int [] number) {
		for( int i = 1; i < number.length; i++ )
			if( number[i] == 4 ) return i;
		return -1;
	}

	public static boolean isTriple(int [] number) {
		for( int i = 1; i < number.length; i++ )
			if( number[i] == 3 ) return true;
		return false;
	}

	public static int getTriple(int [] number) {
		for( int i = 1; i < number.length; i++ )
			if( number[i] == 3 ) return i;
		return -1;
	}

	public static int isPairs(int [] number) {
		int pair = 0;
		for( int i = 1; i < number.length; i++ )
			if( number[i] == 2 ) pair++;
		return pair;
	}

	public static int getBigPair(int [] number) {
		for( int i = number.length - 1; i > 0; i-- )
			if( number[i] == 2 ) return i;
		return -1;
	}

	public static int getSmallPair(int [] number) {
		for( int i = 1; i < number.length; i++ )
			if( number[i] == 2 ) return i;
		return -1;
	}
	
	public static int getBiggest(int [] number) {
		for( int i = number.length - 1; i > 0; i-- )
			if( number[i] != 0 ) return i;
		return -1;
	}
}
