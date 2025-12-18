import java.io.*;

public class Boj34750 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int parent = 0;
        int jaemin = 0;

        if (n >= 1000000) {
            parent = (int) (n * 0.2);
            jaemin = n - parent;
        } else if (n >= 500000) {
            parent = (int) (n * 0.15);
            jaemin = n - parent;
        } else if (n >= 100000) {
            parent = (int) (n * 0.1);
            jaemin = n - parent;
        } else {
            parent = (int) (n * 0.05);
            jaemin = n - parent;
        }

        System.out.println(parent + " " + jaemin);
    }
}
