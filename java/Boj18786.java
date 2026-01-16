import java.io.*;
import java.util.StringTokenizer;

public class Boj18786 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] x = new int[N];
        int[] y = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        long maxDoubleArea = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (x[i] == x[j]) {
                    for (int k = 0; k < N; k++) {
                        if (y[i] == y[k]) {
                            long width = Math.abs(x[k] - x[i]);
                            long height = Math.abs(y[j] - y[i]);
                            maxDoubleArea = Math.max(maxDoubleArea, width * height);
                        }
                    }
                }
            }
        }

        System.out.println(maxDoubleArea);
    }
}
