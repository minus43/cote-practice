import java.io.*;
import java.math.BigInteger;

public class Boj14928 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int mod = 20000303;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            result = (result * 10 + (s.charAt(i) - '0')) % mod;
        }

        System.out.println(result);
    }
}
