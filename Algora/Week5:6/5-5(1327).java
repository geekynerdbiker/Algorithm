import java.util.*;

public class Main {
    public static final Scanner kb = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = kb.nextInt();
        int K = kb.nextInt();
        kb.nextLine();
        
        String set = kb.nextLine().replace(" ", "");
        System.out.println(bfs(set, N, K));
    }
    
    private static int bfs(String set, int n, int k) {
        String result = sort(set);
        Set<String> vSet = new HashSet<>();
        
        Queue<Data> queue = new LinkedList<>();
        queue.add(new Data(set, 0));
        
        while( !queue.isEmpty() ) {
            Data data = queue.poll();
            if( result.equals(data.set) )
                return data.depth;
            
            if( !vSet.contains(data.set) ) {
                vSet.add(data.set);
                for( int i = 0; i <= n - k; i++ )
                    queue.add(new Data(reverse(data.set, i, i + k), data.depth + 1));
            }
        }
        
        return -1;
    }
    
    private static String sort(String set) {
        char [] arr = set.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    
    private static String reverse(String str, int beginIndex, int endIndex) {
        StringBuilder reverse = new StringBuilder();
        String applyString = str.substring(beginIndex, endIndex);
        
        for(int i = applyString.length() - 1; i >= 0; i--) {
            reverse.append(applyString.charAt(i));
        }
        
        return str.substring(0, beginIndex) + reverse + str.substring(endIndex);
    }
    
    private static class Data {
        private String set;
        private int depth;
        
        private Data(String set, int depth) {
            this.set = set;
            this.depth = depth;
        }
    }
}
