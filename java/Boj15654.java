import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj15654 {
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
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);
                if (i + 1 < arr.length)
                    sb.append(" ");
            }
            System.out.println(sb);
        } else {
            for (int i = 0; i < n; i++) {
                if (depth >= 1 && visited[i]) {
                    continue;
                }
                arr[depth] = arr2[i];
                visited[i] = true;
                tracking(arr, depth + 1, n, m);
                visited[i] = false;
            }
        }
    }
}
