/*
 Q. 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 
 Input. 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
    둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 Output. 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */
package exercises;

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
