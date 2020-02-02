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
	
	System.out.println(getEnergy(0,0));
	}
	
	public static int getEnergy(int index, int sum) {
		if( index == 0 || index == energy.size() ) return 0;
		sum += energy.get(index-1) * energy.get(index+1);
		energy.remove(index-1);
		energy.remove(index+1);
		
		return sum + getEnergy(index+1, sum);
	}
}