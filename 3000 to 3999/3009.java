import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int x1 = 0, x2 = 0, x3 = 0, y1 = 0, y2 = 0, y3 = 0;
        
        x1 = kb.nextInt();
        y1 = kb.nextInt();
        
        x2 = kb.nextInt();
        y2 = kb.nextInt();
        
        x3 = kb.nextInt();
        y3 = kb.nextInt();
        
        System.out.println(func(x1, x2, x3) + " " + func(y1, y2, y3));
    }
    
    public static int func (int n1, int n2, int n3) {
        if( n1 != n2 )
            if( n2 != n3 ) return n2;
            else return n1;
            else return n3;
    }
}
