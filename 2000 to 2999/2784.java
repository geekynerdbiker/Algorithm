import java.io.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static String[] puzzle, word;

	public static void main(String[] args) throws IOException {
		puzzle = new String[3];
		word = new String[6];

		for (int i = 0; i < 6; i++)
			word[i] = br.readLine();

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				for (int k = 0; k < 6; k++) {
					if (i == j || j == k || k == i) continue;
					puzzle[0] = word[i];
					puzzle[1] = word[j];
					puzzle[2] = word[k];
					solve();
				}
			}
		}
		System.out.print(0);
	}

	public static void solve() {
		boolean[] check = new boolean[6];
		int cnt = 0;

		for (int k = 0; k < 3; k++) {
			for (int i = 0; i < 6; i++) {
				if (!check[i] && puzzle[k].equals(word[i])) {
					check[i] = true;
					cnt++;
					break;
				}
			}
			for (int i = 0; i < 6; i++) {
				if (!check[i] && puzzle[0].charAt(k) == word[i].charAt(0) && puzzle[1].charAt(k) == word[i].charAt(1) && puzzle[2].charAt(k) == word[i].charAt(2)) {
					check[i] = true;
					cnt++;
					break;
				}
			}
		}

		if (cnt == 6) {
			for (int i = 0; i < 3; i++)
				System.out.println(puzzle[i]);
			System.exit(0);
		}
	}
}