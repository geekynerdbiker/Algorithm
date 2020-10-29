import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException {
        long a = kb.nextLong(), b = kb.nextLong(), c = kb.nextLong();
        
        System.out.println(a+b+c);
    }
}
