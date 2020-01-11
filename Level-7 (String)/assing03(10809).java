import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int order = 0;
        
        String s = kb.next();
        char [] c = new char [s.length()];
        int [] alp = new int [26];
        boolean [] alpCheck = new boolean [26];
        
        Arrays.fill(alp, -1);
        
        for( int i = 0; i < s.length(); i++ ) {
            c[i] = s.charAt(i);
            
            if (alpCheck[(int)c[i] - 97] == false)
                alp[(int)c[i] - 97] = order++;
            else
                order++;
            alpCheck[(int)c[i] - 97] = true;
        }
        for( int i = 0; i < alp.length; i++ )
            System.out.print(alp[i] + " ");
        
    }
}

/*
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        for (char c = 'a' ; c <= 'z' ; c++)
            System.out.print(input.indexOf(c) + " ");
    }
}
*/
