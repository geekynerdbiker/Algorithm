import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		String line;

		while ((line = br.readLine()) != null ) {
			int N  = Integer.parseInt(line);
			if (N % 6 == 0) bw.write("Y\n");
			else bw.write("N\n");
			bw.flush();
		}
	}
}