import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int arr[] = new int [8];
        boolean asce = true, desc = true;
        int max = 0, index = 0;
        
        for( int i = 0; i < 8; i++) {
            arr[i] = kb.nextInt();
            
            if( i > 0 && arr[i] > arr[i-1] )
                desc = false;
            else if( i > 0 && arr[i] < arr[i-1] )
                asce = false;
        }
        
        if( asce )
            System.out.println("ascending");
        else if( desc )
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}
