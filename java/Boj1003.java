import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Boj1003 {
    static int[] fibo = new int[41];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> result = new ArrayList<>();
        fibo[0] = 0;
        fibo[1] = 1;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());
            result.add(fibonacci(num - 1) + " " + fibonacci(num));
        }
        result.forEach(el -> System.out.println(el));
    }

    public static int fibonacci(int n) {

        if (n >= 2 && fibo[n] != 0) {
            return fibo[n];
        }

        if (n == 1) {
            return fibo[1];
        } else if (n == 0) {
            return fibo[0];
        } else if (n == -1) {
            return 1;
        } else {
            int target = fibonacci(n - 1) + fibonacci(n - 2);
            fibo[n] = target;
            return target;
        }
    }
}
