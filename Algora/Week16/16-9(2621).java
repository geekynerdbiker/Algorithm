import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		Card [] hand = new Card [5];

		for( int i = 0; i < 5; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char [] color = st.nextToken().toCharArray();
			int number = Integer.parseInt(st.nextToken());
			hand[i] = new Card(color[0], number);
		}

		Arrays.sort(hand, new cardComparator());

		for( int i = 0; i < 5; i++ )
			System.out.println(hand[i].color + " " + hand[i].number);

		bw.write(Integer.toString(checkHand(hand)));
		bw.flush();
	}

	public static int checkHand(Card [] hand) {
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

	public static boolean isFlush(Card [] hand) {
		for( int i = 0; i < 4; i++ )
			if( hand[i].color != hand[i+1].color )
				return false;
		return true;
	}

	public static boolean isStraight(Card [] hand) {
		for( int i = 0; i < 4; i++ )
			if( hand[i].number != hand[i+1].number - 1 )
				return false;
		return true;
	}

	public static boolean isFourCard(Card [] hand) {
		int count = 0;
		for( int i = 0; i < 4; i++ )
			if( hand[i].number == hand[i+1].number ) count++;

		if( count == 3 ) return true;
		return false;
	}

	public static int getFourCard(Card [] hand) {
		int count = 0;
		for( int i = 0; i < 4; i++ ) {
			if( hand[i].number == hand[i+1].number ) count++;
			if( count == 3 ) return hand[i].number; 
		}
		return 0;
	}

	public static boolean isTriple(Card [] hand) {
		int count = 0;
		for( int i = 0; i < 4; i++ )
			if( hand[i].number == hand[i+1].number ) count++;

		if( count == 2 ) return true;
		return false;
	}

	public static int getTriple(Card [] hand) {
		int count = 0;
		for( int i = 0; i < 4; i++ ) {
			if( hand[i].number == hand[i+1].number ) count++;
			if( count == 2 ) return hand[i].number; 
		}
		return 0;
	}

	public static int isPairs(Card [] hand) {
		int pair = 0;
		for( int i = 0; i < 4; i++ )
			if( hand[i].number == hand[i+1].number ) {
				pair++;
				i++;
			}

		return pair;
	}

	public static int getBigPair(Card [] hand) {
		for( int i = 3; i >= 0; i-- )
			if( hand[i].number == hand[i+1].number )
				return hand[i].number;
		return 0;
	}

	public static int getSmallPair(Card [] hand) {
		for( int i = 0; i < 4; i++ )
			if( hand[i].number == hand[i+1].number )
				return hand[i].number;
		return 0;
	}

	public static int getSmallPair(Card [] hand, int k) {
		for( int i = 0; i < 4; i++ ) {
			if( hand[i].number == k ) continue;
			if( hand[i].number == hand[i+1].number )
				return hand[i].number;
		}
		return 0;
	}
}

class Card {
	char color;
	int number;

	public Card(char c, int n) {
		this.color = c;
		this.number = n;
	}
}

class cardComparator implements Comparator<Card> {
	@Override
	public int compare(Card c1, Card c2) {
		if( c1.number > c2.number ) return 1;
		return -1;
	}
}