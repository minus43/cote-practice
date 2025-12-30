import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj15663 {
    static int[] arr;
    static boolean[] visited;
    static int[] arr2;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        visited = new boolean[n];
        arr2 = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr2);

        tracking(arr, 0, n, m);
    }

    public static void tracking(int[] arr, int depth, int n, int m) {
        if (depth == m) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.setLength(sb.length() - 1);
            System.out.println(sb);
            return;
        }

        int prev = -1;
        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;
            if (arr2[i] == prev)
                continue;

            visited[i] = true;
            arr[depth] = arr2[i];
            prev = arr2[i];

            tracking(arr, depth + 1, n, m);

            visited[i] = false;
        }
    }

}
