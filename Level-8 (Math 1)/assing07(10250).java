import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int T = kb.nextInt();
        
        for( int i = 0; i < T; i++ ) {
            int hei = kb.nextInt();
            int wid = kb.nextInt();
            int vst = kb.nextInt();
            
            String room = new String();
            int flr, rnumber;
            
            if( vst > hei * wid )
                return;
            if( vst == 0 )
                return;
            
            if( vst % hei != 0 ) {
                flr = vst % hei;
                rnumber = vst / hei + 1;
            }
            else {
                flr = hei;
                rnumber = vst / hei;
            }
            
            room = room.concat(Integer.toString(flr));
            
            if( rnumber < 10 )
                room = room.concat("0").concat(Integer.toString(rnumber));
            else
                room = room.concat(Integer.toString(rnumber));
            
            System.out.println(room);
            
        }
    }
}
