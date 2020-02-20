import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		char [] lPinky = { '1', 'Q', 'A', 'Z' };
		char [] rPinky = { '0', 'P', ';', '/', '-', '[', '\'', '=', ']' };
		char [] lRing = { '2', 'W', 'S', 'X' };
		char [] rRing = { '9', 'O', 'L', '.' };
		char [] lMiddle = { '3', 'E', 'D', 'C' };
		char [] rMiddle = { '8', 'I', 'K', ',' };
		char [] lIndex= { '4', '5', 'R', 'T', 'F', 'G', 'V', 'B' };
		char [] rIndex= { '6', '7', 'Y', 'U', 'H', 'J', 'N', 'M' };
		
		char [] input = br.readLine().toCharArray();
		int [] fingers = new int [8];
		
		for( int i = 0; i < input.length; i++ ) {
			for( int j = 0; j < lPinky.length; j++ )
				if( input[i] == lPinky[j] ) fingers[0]++;
			for( int j = 0; j < rPinky.length; j++ )
				if( input[i] == rPinky[j] ) fingers[7]++;
			
			for( int j = 0; j < lRing.length; j++ )
				if( input[i] == lRing[j] ) fingers[1]++;
			for( int j = 0; j < rRing.length; j++ )
				if( input[i] == rRing[j] ) fingers[6]++;
			
			for( int j = 0; j < lMiddle.length; j++ )
				if( input[i] == lMiddle[j] ) fingers[2]++;
			for( int j = 0; j < rMiddle.length; j++ )
				if( input[i] == rMiddle[j] ) fingers[5]++;
			
			for( int j = 0; j < lIndex.length; j++ )
				if( input[i] == lIndex[j] ) fingers[3]++;
			for( int j = 0; j < rIndex.length; j++ )
				if( input[i] == rIndex[j] ) fingers[4]++;
		}
		
		for( int i = 0; i < fingers.length; i++ )
			bw.write(Integer.toString(fingers[i]) + "\n");
		bw.flush();
	}
}