import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        boolean isInTag = false;
        String input = br.readLine();

        Stack<Character> stack = new Stack<>();
        for (int i=0; i < input.length(); i++) {
            if (input.charAt(i) == '<') {
                isInTag = true;
                popAll(stack);
                System.out.print(input.charAt(i));
            }
            else if (input.charAt(i) == '>') {
                isInTag = false;
                System.out.print(input.charAt(i));
            }
            else if (isInTag) {
                System.out.print(input.charAt(i));
            }
            else {
                if(input.charAt(i) == ' ') {
                    popAll(stack);
                    System.out.print(' ');
                }
                else {
                    stack.push(input.charAt(i));
                }
            }
        }

        popAll(stack);
    }

    static void popAll(Stack stack) {
        while (!stack.isEmpty()) System.out.print(stack.pop());
    }
}