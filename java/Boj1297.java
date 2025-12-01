import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1297 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int d = Integer.parseInt(input[0]);
        double h = Integer.parseInt(input[1]);
        double w = Integer.parseInt(input[2]);

        double base = d / Math.sqrt(Math.pow(h, 2) + Math.pow(w, 2));
        System.out.println((int) Math.floor(base * h) + " " + (int) Math.floor(base * w));

    }

}
