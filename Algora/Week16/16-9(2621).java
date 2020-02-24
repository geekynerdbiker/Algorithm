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
		int score = checkHand(hand);
		
	}
	
	public static int checkHand(Card [] hand) {
		int score = 0;
		int rules = 0;
		
		
		
		return score;
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