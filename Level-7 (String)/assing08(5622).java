import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        char [] dial = kb.next().toCharArray();
        int time = 0;
        
        for( int i = 0; i < dial.length; i++ )
            if( dial[i] < 68 )
                time += 2;
            else if( dial[i] < 71 )
                time += 3;
            else if( dial[i] <  74 )
                time += 4;
            else if( dial[i] < 77 )
                time += 5;
            else if( dial[i] < 80 )
                time += 6;
            else if( dial[i] < 84 )
                time += 7;
            else if( dial[i] < 87 )
                time += 8;
            else if( dial[i] < 91 )
                time += 9;
        
        System.out.println(time + dial.length);
    }
}
