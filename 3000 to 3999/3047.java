import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    private static int arr[][];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        
        int arr[] = new int[3];
        
        for (int i = 0; i < 3; i++) arr[i] = Integer.parseInt(str1[i]);
        
        Arrays.sort(arr);
        String str2[] = br.readLine().split("");
        
        for (int i = 0; i < 3; i++) bw.write(arr[str2[i].charAt(0) - 'A'] + " ");
        
        bw.flush();
    }
}
