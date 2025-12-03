import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj27959 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        if ((n * 100) - m >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
