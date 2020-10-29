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
