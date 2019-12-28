import java.util.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int N = kb.nextInt();
        int [][] time = new int [N][2];
        
        for( int i = 0; i < N; i++ ) {
            time[i][0] = kb.nextInt();
            time[i][1] = kb.nextInt();
        }
        
        Arrays.sort(time, new Comparator<int []>() {
            
            @Override
            public int compare(int [] start, int [] end) {
                // TODO Auto-generated method stub
                if( start[1] == end[1] )
                    return Integer.compare(start[0], end[0]);
                return Integer.compare(start[1], end[1]);
            }
        });
        
        int cur = 0;
        int count = 0;
        
        for( int i = 0; i < N; i++ )
            if( cur <= time[i][0] ) {
                cur = time[i][1];
                count++;
            }        
        System.out.println(count);
    }
}
