import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        
        Stack<Double> stack = new Stack<>();
        char [] notation = br.readLine().toCharArray();
        double [] number = new double [N];
        
        for( int i = 0; i < N; i++ ) {
            st = new StringTokenizer(br.readLine());
            number[i] = Integer.parseInt(st.nextToken());
        }
        
        for( int i = 0; i < notation.length; i++ ) {
            int index = (int)notation[i] - 65;
            
            if( notation[i] == '+' ) {
                double tmp = stack.pop();
                stack.push(stack.pop() + tmp);
            }
            else if( notation[i] == '-' ) {
                double tmp = stack.pop();
                stack.push(stack.pop() - tmp);
            }
            else if( notation[i] == '*' ) {
                double tmp = stack.pop();
                stack.push(stack.pop() * tmp);
            }
            else if( notation[i] == '/' ) {
                double tmp = stack.pop();
                stack.push(stack.pop() / tmp);
            }
            
            else stack.push(number[index]);
        }
        System.out.println( String.format("%.2f", stack.pop()) );
    }
}
