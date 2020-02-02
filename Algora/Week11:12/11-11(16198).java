import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static ArrayList<Integer> energy;
	public static void main(String args[]) throws IOException {
	int N = Integer.parseInt(br.readLine());
	energy = new ArrayList<Integer>();

	StringTokenizer st = new StringTokenizer(br.readLine());
	for( int i = 0; i < N; i++ )
		energy.add(Integer.parseInt(st.nextToken()));
	
	System.out.println(getEnergy(0));
	}
	
	public static int getEnergy(int sum) {
		if( energy.size() == 2 ) return 0;
		int max = 0, maxIndex = 0;
		for( int i = 1; i < energy.size()-1; i++ ) {
			int tmpSum = energy.get(i-1) * energy.get(i+1);
			max = Math.max(max, tmpSum);
			if( max == tmpSum ) maxIndex = i;
		}
		
		//
		for(int i = 0; i < energy.size(); i++)
			System.out.print(energy.get(i) + " " );
		System.out.println();
		System.out.println(max);
		//
		
		energy.remove(maxIndex);
		return max + getEnergy(sum);	
	}
}