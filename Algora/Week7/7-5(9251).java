import java.util.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    public static int [][] dir = { {1, 0}, {0, 1}, {-1, 0}, {0, -1} };
    
    public static void main(String args[]) {
        int W = kb.nextInt(), H = kb.nextInt();
        int [][] box = new int [H][W];
        
        for( int i = 0; i < H; i++ )
            for( int j = 0; j < W; j++ )
                box[i][j] = kb.nextInt();
        
        BFS(box, H, W);
    }
    
    public static void BFS(int [][] box, int h, int w) {
        Queue<Point> q = new LinkedList<Point>();
        
        for( int i = 0; i < h; i++ )
            for( int j = 0; j < w; j++ )
                if( box[i][j] == 1 )
                    q.add(new Point(i, j));
        
        while( !q.isEmpty() ) {
            Point point = q.poll();
            
            for( int i = 0; i < 4; i++ ) {
                int nextX = point.x + dir[i][0];
                int nextY = point.y + dir[i][1];
                
                if( nextX < 0 || nextX >= h || nextY < 0 || nextY >= w ) continue;
                if( box[nextX][nextY] != 0 ) continue;
                
                box[nextX][nextY] = box[point.x][point.y] + 1;
                q.add(new Point(nextX, nextY));
            }
        }
        
        int max = 0;
        
        for( int i = 0; i < h; i++ )
            for( int j = 0; j < w; j++ ) {
                if( box[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, box[i][j]);
            }
        System.out.println(max - 1);
    }
}

class Point {
    int x, y;
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
