import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Boj31048 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> result = new ArrayList<>();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int target = Integer.parseInt(br.readLine());
            result.add(facto(target));
        }
        result.forEach(el -> System.out.println(el));
    }

    public static int facto(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * facto(n - 1)) % 10;
        }
    }
}
