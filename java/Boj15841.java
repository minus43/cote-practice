import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Boj15841 {
    static BigInteger[] pivotArr = new BigInteger[491];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> time = new ArrayList<>();
        pivotArr[1] = BigInteger.ONE;
        pivotArr[2] = BigInteger.ONE;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            } else {
                time.add(n);
                for (int i = 3; i <= n; i++) {
                    if (pivotArr[i] == null) {
                        pivotArr[i] = pivotArr[i - 1].add(pivotArr[i - 2]);
                    }
                }
            }
        }
        time.forEach(el -> System.out.println("Hour " + el + ": " + pivotArr[el] + " cow(s) affected"));
    }
}
