import java.util.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        String [] song = { "baby", "sukhwan", "tururu", "turu", "very", "cute", "tururu", "turu", "in", "bed", "tururu", "turu", "baby", "sukhwan" };
        
        int N = kb.nextInt();
        int ru = 0;
        String word;
        
        if( N > 14 ) {
            ru = N / 14;
            N = N % 14;
        }
        if( N == 0 ) word = song[13];
        else word = song[N-1];
        
        if( word.equals("tururu") && ru <= 2 )
            for( int i = 0; i < ru; i++ )
                word = word.concat("ru");
        
        else if( word.equals("turu") && ru <= 3 )
            for( int i = 0; i < ru; i ++ )
                word = word.concat("ru");
        
        else if( word.equals("tururu") ) {
            word = "tu+ru*";
            int ruru = 2 + ru;
            word = word.concat(Integer.toString(ruru));
        }
        
        else if( word.equals("turu") ) {
            word = "tu+ru*";
            int ruru = 1 + ru;
            word = word.concat(Integer.toString(ruru));
        }
        System.out.println(word);
    }
}
