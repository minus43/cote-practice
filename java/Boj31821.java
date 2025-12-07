import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj31821 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] menu = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            menu[i] = Integer.parseInt(br.readLine());
        }

        int m = Integer.parseInt(br.readLine());
        for (int o = 0; o < m; o++) {
            total += menu[Integer.parseInt(br.readLine()) - 1];
        }
        System.out.println(total);
    }

}
