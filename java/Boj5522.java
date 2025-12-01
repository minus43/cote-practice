import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj5522 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += Integer.parseInt(br.readLine());
        }
        System.out.println(total);
    }

}
