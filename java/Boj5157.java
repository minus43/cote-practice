import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj5157 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> result = new ArrayList<>();
        int k = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < k; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine().strip());
            int c = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            int n = Integer.parseInt(st1.nextToken());
            int r = Integer.parseInt(st1.nextToken());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            List<String> cs = new ArrayList<>();
            for (int o = 0; o < b; o++) {
                cs.add(st2.nextToken());
            }
            int total = 0;
            for (int o = 0; o < n; o++) {
                String[] input = br.readLine().split(" ");
                if (cs.contains(input[0])) {
                    total += (Integer.parseInt(input[1]) * r) / 100;
                }
            }
            result.add("Data Set " + (i + 1) + ":\n" + total);
        }
        System.out.println(String.join("\n\n", result));

    }
}
