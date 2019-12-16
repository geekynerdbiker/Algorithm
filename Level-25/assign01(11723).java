/*
 Q. 비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.
 
 add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
 remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
 check x: S에 x가 있으면 1을, 없으면 0을 출력한다.
 toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
 all: S를 {1, 2, ..., 20} 으로 바꾼다.
 empty: S를 공집합으로 바꾼다.

 Input. 첫째 줄에 수행해야 하는 연산의 수 M (1 ≤ M ≤ 3,000,000)이 주어진다. 둘째 줄부터 M개의 줄에 수행해야 하는 연산이 한 줄에 하나씩 주어진다.
 Output. check 연산이 주어질때마다, 결과를 출력한다.
 */
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
