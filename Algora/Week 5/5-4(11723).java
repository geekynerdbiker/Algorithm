package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    public static int [] set = new int [21];
    
    public static void main(String args[]) {
        
        int comNum = kb.nextInt();
        
        for( int i = 0; i < comNum; i++ ) {
            String command = kb.next();
            
            if( command.compareTo("add") == 0 ) {
                int k = kb.nextInt();
                add(k);
            }
            else if( command.compareTo("remove") == 0 ) {
                int k = kb.nextInt();
                remove(k);
            }
            else if( command.compareTo("check") == 0 ) {
                int k = kb.nextInt();
                check(k);
            }
            else if( command.compareTo("toggle") == 0 ) {
                int k = kb.nextInt();
                toggle(k);
            }
            else if( command.compareTo("all") == 0 )
                all();
            else if( command.compareTo("empty") == 0 )
                empty();
        }
    }
    
    public static void add(int x) { set[x] = 1; }
    public static void remove(int x) { set[x] = 0; }
    public static void check(int x) { if( set[x] == 1 ) System.out.println("1"); else System.out.println("0"); }
    public static void toggle(int x) { if (set[x] == 1 ) set[x] = 0; else set[x] = 1; }
    public static void all() { Arrays.fill(set, 1); }
    public static void empty() { Arrays.fill(set, 0); }
}
