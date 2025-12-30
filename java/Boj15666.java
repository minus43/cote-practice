import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj15666 {
    static int[] arr;
    static int[] arr2;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(st2.nextToken());
            if (!list.contains(target)) {
                list.add(target);
            }

        }
        arr2 = list.stream().mapToInt(x -> x.intValue()).sorted().toArray();
        tracking(arr, 0, 0, m);
    }

    public static void tracking(int[] arr, int start, int depth, int m) {
        if (depth == m) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.setLength(sb.length() - 1);
            System.out.println(sb);
            return;
        }
        for (int i = start; i < arr2.length; i++) {
            arr[depth] = arr2[i];
            tracking(arr, i, depth + 1, m);
        }
    }
}
