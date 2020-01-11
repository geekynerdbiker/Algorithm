import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int N = kb.nextInt();
        int cnt = 0;
        
        while( N >= 5 ) {
            if( N % 5 == 0) {
                cnt = N / 5;
                System.out.println(cnt);
                
                return;
            }
            
            N -= 5;
            cnt++;
        }
        
        while( cnt != -1 ) {
            if( N % 3 == 0 ) {
                cnt += N / 3;
                break;
            }
            else {
                cnt--;
                N += 5;
            }
        }
        System.out.println(cnt);
    }
}
