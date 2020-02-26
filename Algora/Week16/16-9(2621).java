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

		bw.write(Integer.toString(checkHand(hand)));
		bw.flush();
	}

	public static int checkHand(int [] color, int [] number) {
		int score = 0;
		int pair = isPairs(hand);

		if( isFlush(hand) && isStraight(hand) )
			return 900 + hand[4].number;
		if( isFourCard(hand) )
			return 800 + getFourCard(hand);
		if( isTriple(hand) && pair == 1 )
			return 700 + getTriple(hand) * 10 + getSmallPair(hand, getTriple(hand));
		if( isFlush(hand) )
			return 600 + hand[4].number;
		if( isStraight(hand) )
			return 500 + hand[4].number;
		if( isTriple(hand) )
			return 400 + getTriple(hand);
		if( pair == 2 )
			return 300 + getBigPair(hand) * 10 + getSmallPair(hand);
		if( pair == 1 )
			return 200 + getSmallPair(hand);
		if( score == 0 )
			return 100 + hand[4].number; 

		return 0;
	}

	public static boolean isFlush(int [] color, int [] number) {
		for( int i = 0; i < 4; i++ )
			if( color[i] == 4 )
				return true;
		return false;
	}

	public static boolean isStraight(int [] color, int [] number) {
		for( int i = 0; i < 4; i++ )
			if( hand[i].number != hand[i+1].number - 1 )
				return false;
		return true;
	}

	public static boolean isFourCard(int [] color, int [] number) {
		int count = 0;
		for( int i = 0; i < 4; i++ )	
			if( hand[i].number == hand[i+1].number ) count++;

		if( count == 3 ) return true;
		return false;
	}

	public static int getFourCard(int [] color, int [] number) {
		int count = 0;
		for( int i = 0; i < 4; i++ ) {
			if( hand[i].number == hand[i+1].number ) count++;
			if( count == 3 ) return hand[i].number; 
		}
		return 0;
	}

	public static boolean isTriple(int [] color, int [] number) {
		int count = 0;
		for( int i = 0; i < 4; i++ )
			if( hand[i].number == hand[i+1].number ) count++;

		if( count == 2 ) return true;
		return false;
	}

	public static int getTriple(int [] color, int [] number) {
		int count = 0;
		for( int i = 0; i < 4; i++ ) {
			if( hand[i].number == hand[i+1].number ) count++;
			if( count == 2 ) return hand[i].number; 
		}
		return 0;
	}

	public static int isPairs(int [] color, int [] number) {
		int pair = 0;
		for( int i = 0; i < 4; i++ )
			if( hand[i].number == hand[i+1].number ) {
				pair++;
				i++;
			}

		return pair;
	}

	public static int getBigPair(int [] color, int [] number) {
		for( int i = 3; i >= 0; i-- )
			if( hand[i].number == hand[i+1].number )
				return hand[i].number;
		return 0;
	}

	public static int getSmallPair(int [] color, int [] number) {
		for( int i = 0; i < 4; i++ )
			if( hand[i].number == hand[i+1].number )
				return hand[i].number;
		return 0;
	}

	public static int getSmallPair(int [] color, int [] number, int k) {
		for( int i = 0; i < 4; i++ ) {
			if( hand[i].number == k ) continue;
			if( hand[i].number == hand[i+1].number )
				return hand[i].number;
		}
		return 0;
	}
}
