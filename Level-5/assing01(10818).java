/*
 Q. N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 
 Input. 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 Output. 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */
package exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int size = kb.nextInt();
        int arr[] = new int [size];
        int min = 0, max = 0;
        
        for( int i = 0; i < size; i++) {
            arr[i] = kb.nextInt();
            
            if( i == 0 ) {
                min = arr[0];
                max = arr[0];
            }
            
            else {
                if( arr[i] < min)
                    min = arr[i];
                else if( arr[i] > max)
                    max = arr[i];
            }
        }
        System.out.println(min + " " + max);
        
    }
}
