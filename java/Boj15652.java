import java.io.*;
import java.util.StringTokenizer;

public class Boj15652 {
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        tracking(arr, 1, 0, n, m);
    }

    public static void tracking(int[] arr, int start, int depth, int n, int m) {
        if (depth == m) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);
                if (i + 1 < arr.length)
                    sb.append(" ");
            }
            System.out.println(sb);
        } else {
            for (int i = start; i < n + 1; i++) {
                arr[depth] = i;
                tracking(arr, i, depth + 1, n, m);
            }
        }
    }
}
