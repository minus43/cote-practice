import java.io.*;

public class Boj1463 {
    static int[] num = new int[1000001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        while (n != 1) {
            n = op(n);
        }
        
    }

    public static int op(int n) {
        count++;
        if (n % 3 == 0) {
            return n / 3;
        } else if (n % 2 == 0) {
            return n / 2;
        } else {
            return n - 1;
        }
    }
}
