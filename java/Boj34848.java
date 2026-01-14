import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Boj34848 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            while (n != 1) {
                int main = n / 2;
                int sub = n % 2;
                count += sub;
                n = main + sub;
            }
            result.add(count);
        }

        result.forEach(el -> System.out.println(el));
    }
}
