import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int arr[] = new int [10];
        
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        int n = a * b * c;
        
        while( n > 9 ) {
            arr[n%10]++;
            n = n / 10;
        }
        
        arr[n%10]++;
        
        for( int i = 0; i < 10; i++)
            System.out.println(arr[i]);
    }
}
