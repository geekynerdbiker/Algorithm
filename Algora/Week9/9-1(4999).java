import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException {
        int s1 = br.readLine().length();
        int s2 = br.readLine().length();
        
        if( s1 >= s2 ) System.out.println("go");
        else System.out.println("no");
    }
}
