import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int a = kb.nextInt();
        int b = kb.nextInt();
        
        int n1 = a*((b%100)%10);//5
        int n2 = a*((b%100)/10);//8
        int n3 = a*(b/100);
        int n = n1 + n2*10 + n3*100;
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n);
    }
}
