import java.io.*;
import java.math.BigInteger;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BigInteger N = new BigInteger(br.readLine());
        BigInteger x = new BigInteger("18446744073709551616");

        for(int k = 64; !N.equals(BigInteger.ZERO); k--) {
            if (N.equals(x.subtract(BigInteger.ONE))) {
                System.out.print(k);
                break;
            }
            N = N.divide(BigInteger.TWO);
            x = x.divide(BigInteger.TWO);
        }
    }
}