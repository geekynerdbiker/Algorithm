import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int T = kb.nextInt();
        
        for( int i = 0; i < T; i++ ) {
            int std = kb.nextInt();
            int [] score = new int [std];
            double sum = 0, avg = 0, sSum = 0, sAvg = 0;
            
            for( int j = 0; j < std; j++ ) {
                score[j] = kb.nextInt();
                sSum += score[j];
            }
            sAvg = sSum / std;
            
            for( int k = 0; k < std; k++)
                if( score[k] > sAvg ) sum++;
            avg = sum / std;
            
            System.out.printf("%.3f%%\n", avg * 100);
        }
    }
}
