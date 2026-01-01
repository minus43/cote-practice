import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj31052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[n + 1];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i + 1] = Integer.parseInt(st2.nextToken());
        }
        for (int o = 0; o < q; o++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int mod = Integer.parseInt(st3.nextToken());
            int num1 = Integer.parseInt(st3.nextToken());
            int num2 = Integer.parseInt(st3.nextToken());

            if (mod == 1) {
                arr[num1] = num2;
            } else if (mod == 2) {
                result.add(Math.abs(arr[num1] - arr[num2]));
            }
        }
        result.forEach(el -> System.out.println(el));
    }
}
