import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int arr[] = new int [9];
        int max = 0, index = 0;

        for( int i = 0; i < 9; i++) {
            arr[i] = kb.nextInt();

            if( i == 0 ) {
                max = arr[0];
            }

            else {
                if( arr[i] > max) {
                    max = arr[i];
                    index = i;
                }
            }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}