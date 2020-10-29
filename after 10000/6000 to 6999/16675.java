import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        char ML = input.charAt(0);
        char MR = input.charAt(2);
        char TL = input.charAt(4);
        char TR = input.charAt(6);

        if (ML == MR) {
            int result1 = comparator(ML, TL);
            int result2 = comparator(ML, TR);

            if (result1 == -1 || result2 == -1) System.out.println("TK");
            else if (result1 == 0 || result2 == 0) System.out.println("?");
            else System.out.println("MS");
        } else if (TL == TR) {
            int result1 = comparator(ML, TL);
            int result2 = comparator(MR, TL);

            if (result1 == 1 || result2 == 1) System.out.println("MS");
            else if (result1 == 0 || result2 == 0) System.out.println("?");
            else System.out.println("TK");
        } else System.out.println("?");
    }

    static int comparator(char x, char y) {
        if (x == 'R') {
            if (y == 'S') return 1;
            else if (y == 'R') return 0;
            else return -1;
        } else if (x == 'S') {
            if (y == 'S') return 0;
            else if (y == 'R') return -1;
            else return 1;
        } else if (x == 'P') {
            if (y == 'S') return -1;
            else if (y == 'R') return 1;
            else return 0;
        }
        return 0;
    }
}