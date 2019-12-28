import java.util.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(new ComparatorDescending());
        
        int N = kb.nextInt();
        
        for( int i = 0; i < N; i++ ) {
            int k = kb.nextInt();
            
            if( k == 0 )
                if( heap.peek() != null )
                    System.out.println(heap.poll());
                else System.out.println(0);
                else
                    heap.add(k);
        }
    }
}

class ComparatorDescending implements Comparator<Integer> {
    
    @Override
    public int compare(Integer o1, Integer o2) {
        // TODO Auto-generated method stub
        if( o1 < o2 ) return 1;
        else return -1;
    }
}
