import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        
        for( int i = 0; i < T; i++ ) {
            Queue<Pair> q = new LinkedList<Pair>();;
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new ComparatorDescending());
            
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), I = Integer.parseInt(st.nextToken());
            int count = 0;
            
            st = new StringTokenizer(br.readLine());
            for( int j = 0; j < N; j++ ) {
                int k = Integer.parseInt(st.nextToken());
                Pair p = new Pair(j, k);
                
                q.add(p);
                pq.add(k);
            }
            
            while( !q.isEmpty() ) {
                int curIndex = q.peek().index;
                int curImportance = q.peek().importance;
                q.poll();
                
                if( pq.peek() == curImportance ) {
                    pq.poll();
                    count++;
                    
                    if( curIndex == I ) {
                        System.out.println(count);
                        break;
                    }
                }
                else {
                    Pair p = new Pair(curIndex, curImportance);
                    q.add(p);
                }
            }
        }
     }
}

class Pair {
    int index, importance;
    
    Pair(int index, int importance) {
        this.index = index;
        this.importance = importance;
    }
}

class ComparatorDescending implements Comparator<Integer> {
    
    @Override
    public int compare(Integer o1, Integer o2) {
        if( o1 < o2 ) return 1;
        return -1;
    }
}
