import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int N = kb.nextInt();
        
        for( int i = 0; i < N; i++ ) {
            if( i == 0 ) {
                for( int j = 0; j < N; j++ ) System.out.print("*");
                for( int j = 0; j < 2 * (N - i) - 3; j++ ) System.out.print(" ");
                for( int j = 0; j < N; j++ ) System.out.print("*");
                
                System.out.println();
            }
            
            else if( i == N-1 ) {
                for( int j = 0; j < N - 1; j++ ) System.out.print(" ");
                System.out.print("*");
                for( int k = 0; k < N - 2; k++ ) System.out.print(" ");
                System.out.print("*");
                for( int k = 0; k < N - 2; k++ ) System.out.print(" ");
                System.out.print("*");
                
                System.out.println();
            }
            
            else {
                for( int j = 0; j < i; j++ ) System.out.print(" ");
                System.out.print("*");
                for( int k = 0; k < N - 2; k++ ) System.out.print(" ");
                System.out.print("*");
                for( int l = 0; l < 2 * (N - i) - 3; l++ ) System.out.print(" ");
                System.out.print("*");
                for( int k = 0; k < N - 2; k++ ) System.out.print(" ");
                System.out.print("*");
                
                
                System.out.println();
            }
        }
        
        for( int i = N-2; i >= 0; i-- ){
            if( i == 0) {
                if( i == 0 ) {
                    for( int j = 0; j < N; j++ ) System.out.print("*");
                    for( int j = 0; j < 2 * (N - i) - 3; j++ ) System.out.print(" ");
                    for( int j = 0; j < N; j++ ) System.out.print("*");
                    
                    System.out.println();
                }
            }
            
            else {
                for( int j = 0; j < i; j++ ) System.out.print(" ");
                System.out.print("*");
                for( int k = 0; k < N - 2; k++ ) System.out.print(" ");
                System.out.print("*");
                for( int l = 0; l < 2* (N - i) - 3; l++ ) System.out.print(" ");
                System.out.print("*");
                for( int k = 0; k < N - 2; k++ ) System.out.print(" ");
                System.out.print("*");
                
                System.out.println();
            }
        }
    }
}
