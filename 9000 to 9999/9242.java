import java.io.*;
import java.util.ArrayList;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static char[][] chess;

    public static void main(String[] args) throws IOException {
        char[][][] code = new char[8][5][3];
        int len = 2;

        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            code[0][i] = line.substring(0, 3).toCharArray();
            code[1][i] = line.substring(4, 7).toCharArray();
            if (line.length() >= 11) {
                code[2][i] = line.substring(8, 11).toCharArray();
                len = 3;
            }
            if (line.length() >= 15) {
                code[3][i] = line.substring(12, 15).toCharArray();
                len = 4;
            }
            if (line.length() >= 19) {
                code[4][i] = line.substring(16, 19).toCharArray();
                len = 5;
            }
            if (line.length() >= 23) {
                code[5][i] = line.substring(20, 23).toCharArray();
                len = 6;
            }
            if (line.length() >= 27) {
                code[6][i] = line.substring(24, 27).toCharArray();
                len = 7;
            }
            if (line.length() >= 31) {
                code[7][i] = line.substring(28, 31).toCharArray();
                len = 8;
            }
        }

        int number = 0;
        for (int i = 0; i < len; i++) {
            number *=10;
            number += getNumber(code[i]);
            if(getNumber(code[i]) == -1){
                System.out.print("BOOM!!");
                return;
            }
        }

        if(number % 6 == 0) System.out.print("BEER!!");
        else System.out.print("BOOM!!");

    }

    public static int getNumber(char[][] arr) {
        if (arr[2][0] == '*' && arr[2][2] == '*' && arr[2][1] == ' ') return 0;
        else if (arr[2][0] == ' ' && arr[2][1] == ' ') {
            if (arr[0][0] == ' ' && arr[0][1] == ' ') return 1;
            else if (arr[0][0] == '*' && arr[0][1] == '*') return 7;
        }
        else if (arr[2][0] == '*' && arr[2][1] == '*' && arr[2][2] == '*') {
            if (arr[3][0] == '*' && arr[3][2] == '*') {
                if (arr[1][0] == '*' && arr[1][2] == ' ') return 6;
                else if (arr[1][0] == '*' && arr[1][2] == '*') return 8;
            }
            else if (arr[1][2] == '*' && arr[3][0] == '*') return 2;
            else if (arr[1][0] == '*' && arr[1][2] == '*') {
                if (arr[4][0] == '*') return 9;
                else return 4;
            }
            else if (arr[1][0] == '*' && arr[3][2] == '*') return 5;
            else if (arr[1][2] == '*') return 3;
        }
        return -1;
    }
}