import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        double rst = 0;
        int max = 0, n = kb.nextInt();
        int [] score = new int [n];
        
        for( int i = 0; i < n; i++ ) {
            score[i] = kb.nextInt();
            
            if( score[i] > max)
                max = score[i];
            rst += score[i];
        }
        rst = ( rst / max * 100 ) / n;
        
        System.out.printf("%.2f", rst);
        kb.close();
    }
}
