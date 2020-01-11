import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        int score = 0, sum = 0;
        String answer = kb.nextLine();
        
        for( int i = 0; i < n; i++ ) {
            answer = kb.nextLine();
            
            for( int j = 0; j < answer.length(); j++ ) {
                char[] arr = answer.toCharArray();
                if( arr[j] == 'O' )
                    score++;
                else
                    score = 0;
                sum += score;
            }
            
            System.out.println(sum);
            sum = 0; score = 0;
        }
        kb.close();
    }
}
