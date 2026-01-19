import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Boj34554 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        List<String> result = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            int a = sol(n);
            if (a == 0) {
                result.add(0 + "");
            } else {
                result.add(1 + "");
                result.add(a + " " + (a + n));

            }
        }
        result.forEach(el -> System.out.println(el));
    }

    public static int sol(int n) {
        int a = 1;
        int b = a + n;
        if (isPrime(a * b)) {
            return a;
        }
        return 0;
    }

    public static boolean isPrime(int n) {
        int end = (int) Math.sqrt(n);
        for (int i = 2; i <= end; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
