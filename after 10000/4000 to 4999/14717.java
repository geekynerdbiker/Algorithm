import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int c1 = Integer.parseInt(st.nextToken());
		int c2 = Integer.parseInt(st.nextToken());

		ArrayList<Integer> cards = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			cards.add(i);
			cards.add(i);
		}

		for(int i=0; i < cards.size(); i++)
			if(cards.get(i) == c1) {
				cards.remove(i);
				break;
			}

		for(int i=0; i < cards.size(); i++)
			if(cards.get(i) == c2) {
				cards.remove(i);
				break;
			}

		double win = 0, lose = 0, deck = getDeck(c1, c2);

		for (int i = 0; i < cards.size(); i++) {
			for (int j = 0; j < cards.size(); j++) {
				if (i != j) {
					if (getDeck(cards.get(i), cards.get(j)) >= deck) lose++;
					else win++;
				}
			}
		}
		double rate = win / (win + lose);
		System.out.printf("%.3f", rate);
	}

	public static int getDeck(int c1, int c2) {
		if (c1 == c2) return c1 * 10;
		else return ((c1 + c2) % 10);
	}
}
