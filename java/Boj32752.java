import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj32752 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int l = Integer.parseInt(st1.nextToken());
        int r = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] origin = new int[n];
        for (int i = 0; i < n; i++) {
            origin[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(origin, l - 1, r);

        if (solution(origin)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    public static boolean solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
