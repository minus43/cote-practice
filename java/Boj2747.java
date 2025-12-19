import java.io.*;

public class Boj2747 {
    static int[] pivoArr = new int[46];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        pivoArr[0] = 0;
        pivoArr[1] = 1;
        int n = Integer.parseInt(br.readLine());
        System.out.println(pivot(n));
    }

    public static int pivot(int n) {
        if (pivoArr[n] != 0 | n == 0) {
            return pivoArr[n];
        }
        pivoArr[n] = pivot(n - 1) + pivot(n - 2);
        return pivoArr[n];

    }
}
