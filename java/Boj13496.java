import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Boj13496 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> result = new ArrayList<>();

        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < k; i++) {
            String[] input1 = br.readLine().split(" ");
            int n = Integer.parseInt(input1[0]);
            int s = Integer.parseInt(input1[1]);
            int d = Integer.parseInt(input1[2]);
            int total = 0;
            for (int o = 0; o < n; o++) {
                String[] input2 = br.readLine().split(" ");
                int di = Integer.parseInt(input2[0]);
                int vi = Integer.parseInt(input2[1]);
                if (di <= s * d) {
                    total += vi;
                }
            }
            result.add(total);
        }
        for (int p = 0; p < result.size(); p++) {
            System.out.println("Data Set " + (p + 1) + ":");
            System.out.println(result.get(p));
            System.out.println();
        }
    }
}
